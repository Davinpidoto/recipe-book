package recipe.book

import com.davdog.Recipe

class BootStrap {

    def init = { servletContext ->
        new Recipe(name: "Rice", prepTime: 1, cookTime: 20).save(flush:true)
        new Recipe(name: "Spaghetti", prepTime: 20, cookTime: 20).save(flush:true)
    }
    def destroy = {
    }
}
