package yan.practise

import static grace.controller.route.Routes.*

/**
 * Book
 * something about this controller
 */

// list page
get('index') {
    params.limit = params.limit ?: 10
    def list = Book.list(params)
    def count = Book.count()

    render('index', [list: list, count: count])
}

get('show') {

}

get('create') {

}

post('save') {

}

get('edit') {

}

post('update') {

}

post('delete') {

}