import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj1_formDetailmanualPayment_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/manualPayment.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #3 for form layouts"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',55,[:],1)
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',151,['controller':("formDetail"),'action':("adminformDetails")],2)
printHtmlPart(8)
invokeTag('render','g',156,['template':("/header/topBar")],-1)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
expressionOut.print(manualPaymenformdets?.commonUserId?.username)
printHtmlPart(11)
expressionOut.print(manualPaymenformdets?.apllicationNo)
printHtmlPart(12)
invokeTag('submitButton','g',310,['name':("create"),'class':("btn green"),'value':(message(code: 'default.button.Submit.label', default: 'Submit'))],-1)
printHtmlPart(13)
})
invokeTag('form','g',311,['url':([resource:formDetailInstance, action:'Manualthankyou']),'class':("form-horizontal"),'enctype':("multipart/form-data")],2)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',415,['class':("page-container-bg-solid"),'onload':("noBack();"),'onpageshow':("if (event.persisted) noBack();"),'onunload':("")],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675772346000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
