package com.tikaydev.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform