import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj1_header_topBar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/header/_topBar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createClosureForHtmlPart(1, 1)
invokeTag('ifAnyGranted','sec',15,['roles':("ROLE_USER")],1)
printHtmlPart(2)
createClosureForHtmlPart(3, 1)
invokeTag('ifAnyGranted','sec',18,['roles':("ROLE_SUPERADMIN")],1)
printHtmlPart(2)
createClosureForHtmlPart(3, 1)
invokeTag('ifAnyGranted','sec',21,['roles':("ROLE_ADMIN")],1)
printHtmlPart(2)
createClosureForHtmlPart(4, 1)
invokeTag('ifAnyGranted','sec',28,['roles':("ROLE_COMMANUSERS")],1)
printHtmlPart(5)
invokeTag('username','sec',28,[:],-1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('submitButton','g',38,['name':("Log Out"),'class':("btn btn-warning")],-1)
printHtmlPart(9)
})
invokeTag('form','g',40,['controller':("logout")],2)
printHtmlPart(10)
})
invokeTag('ifLoggedIn','sec',41,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1675768468000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
