package com.github.rahulsom.swaggydoc

import com.wordnik.swagger.annotations.*
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Api(value = 'demo without matching domain')
class NoDemoController extends RestfulController {

    static responseFormats = ['json', 'xml']

    NoDemoController() {
        super(Demo)
    }

    @Override
    @SwaggyList(searchParam = true)
    def index() {
        super.index()
    }

    @Override@SwaggyShow
    def show() {
        super.show()
    }

    @SwaggySave
    @Override
    def save() {
        super.save()
    }

    @Override@SwaggyUpdate
    def update() {
        super.update()
    }

    @Override@SwaggyDelete
    def delete() {
        super.delete()
    }

    @Override@SwaggyPatch
    Object patch() {
        return super.patch()
    }
}
