package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;
import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //2.组装成父子的树形结构
        //2.1一级分类
        return entities.stream()
                .filter(e -> e.getParentCid() == 0)
                .map(e -> e.setChildren(getChildren(e, entities)))
                .sorted(Comparator.comparing(e -> Optional.ofNullable(e.getSort()).orElse(0)))
                .collect(Collectors.toList());
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 检查当前删除的菜单，是否被别的地方引用


        baseMapper.deleteBatchIds(asList);
    }

    /**
     * 递归查找子菜单
     *
     * @param root 根菜单
     * @param all  所有菜单
     * @return 子菜单集合
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream()
                .filter(e -> e.getParentCid().equals(root.getCatId()))
                .map(e -> e.setChildren(getChildren(e, all)))
                .sorted(Comparator.comparing(e -> Optional.ofNullable(e.getSort()).orElse(0)))
                .collect(Collectors.toList());
    }
}
