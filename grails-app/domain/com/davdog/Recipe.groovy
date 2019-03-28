package com.davdog

import grails.rest.Resource

@Resource(uri='/recipes')
class Recipe {

    String name
    int prepTime
    int cookTime

    static constraints = {
        name blank: false
    }
}
