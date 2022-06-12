package com.example.onlinemarketproject.repositories

import com.example.onlinemarketproject.model.Category
import com.example.onlinemarketproject.model.productItemX
import com.example.onlinemarketproject.network.ApiParameter
import com.example.onlinemarketproject.network.ShopApi

class CategoryRepository {
    suspend fun getAllItems(page:Int,categoryId:String):List<Category> {
        var par= ApiParameter()
        return ShopApi.retrofitService.getCategoryList(
            par.getCategory_Items(page,categoryId)
        )
    }
}