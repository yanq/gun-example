import grace.app.GraceServer
import static grace.route.Routes.*

/**
 * 首页
 */
get('/') {
    respond "Hi,Grace!"
}

/**
 * 路径定义
 */
get('/j') {
    response.writer.write("get /a")
}

/**
 * 路径定义
 */
get('abdsddd') {
    response.writer.write("get /b ")
}

/**
 * 另一种定义方式
 */
"/show" {
    println("aaaaasddffdfddsgaa")
}

//'/eeee'('sss')

//new GraceServer().start()