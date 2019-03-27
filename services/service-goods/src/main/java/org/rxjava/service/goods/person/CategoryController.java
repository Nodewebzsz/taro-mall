package org.rxjava.service.goods.person;

import org.rxjava.service.goods.form.CategoryQueryForm;
import org.rxjava.service.goods.model.CategoryModel;
import org.rxjava.service.goods.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.validation.Valid;

/**
 * @author happy 2019-03-25 23:12
 */
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("categories")
    public Flux<CategoryModel> getList(
        @Valid CategoryQueryForm form
    ) {
        return categoryService
                .getList(form);
    }
}