package example.com.web.pages.homePage

import example.com.web.components.layout.layout
import example.com.web.pages.homePage.navbar.navbar
import example.com.web.components.topbar.topbar
import example.com.web.pages.homePage.homeTab.homeTab
import kotlinx.html.*

fun HTML.homePage() {
    layout {
        topbar()
        div (classes = "bg-slate-100 px-4 ") {
            div(classes = "w-full bg-zinc-50 rounded-2xl shadow-lg") {
                // Navigation Bar
                navbar()

                // content
                div( classes = "flex flex-col justify-center items-center mx-auto max-w-xl bg-zinc-50 mt-1 py-2") {
                    id = "main-content"
                    //homeTab()
                }
            }
        }
        script(src = "/resources/js/homePage.js" ) {}
    }
}