import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_convetjob_formDetailadminformDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/adminformDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #3 for form layouts"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',57,[:],1)
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',179,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',180,['roles':("ROLE_ADMIN")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',186,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',187,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(11)
invokeTag('render','g',192,['template':("/header/topBar")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
expressionOut.print(i+1)
printHtmlPart(15)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "apllicationNo"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "appliyingPost"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "appliyingSub"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "firstName"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "lastName"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "fName"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "mName"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "gender"))
printHtmlPart(21)
invokeTag('formatDate','g',398,['date':(formDetailInstance?.dob),'format':("mm-dd-yyyy")],-1)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "email"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "phoneNumber"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "hNo"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "street"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "village"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "taluka"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "district"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "state"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "pinCode"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "country"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "socialcategory"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "subcast"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "religion"))
printHtmlPart(21)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "kvcNo"))
printHtmlPart(23)
invokeTag('formatDate','g',451,['date':(formDetailInstance?.fvcDate),'format':("dd-mm-yyyy")],-1)
printHtmlPart(24)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "neteducation"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "age"))
printHtmlPart(26)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "ageRelax"))
printHtmlPart(27)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "ageCat"))
printHtmlPart(28)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "sslc"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "obtainedsslc"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "maximumsslc"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "percentagesslc"))
printHtmlPart(21)
invokeTag('formatDate','g',487,['date':(formDetailInstance?.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(30)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "boardUniversitysslc"))
printHtmlPart(31)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "puc"))
printHtmlPart(32)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "obtainedpuc"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "maximumpuc"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "percentagepuc"))
printHtmlPart(33)
invokeTag('formatDate','g',509,['date':(formDetailInstance?.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "boardUniversitypuc"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "kannadaLanguage"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "kpsckannadaexam"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "degreeNameBachelors"))
printHtmlPart(32)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "bachelorsDegree"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "percentagebachelorsDegree"))
printHtmlPart(34)
invokeTag('formatDate','g',532,['date':(formDetailInstance?.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "boardUniversitybachelorsDegree"))
printHtmlPart(25)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "subjectMaster"))
printHtmlPart(32)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "mastersDegree"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "percentagemastersDegree"))
printHtmlPart(21)
invokeTag('formatDate','g',549,['date':(formDetailInstance?.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "boardUniversitymastersDegree"))
printHtmlPart(35)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "pHD"))
printHtmlPart(29)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "pHDSubject"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "percentagepHD"))
printHtmlPart(32)
invokeTag('formatDate','g',565,['date':(formDetailInstance?.pHDyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(36)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "boardUniversitypHD"))
printHtmlPart(37)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',578,['code':("default.button.show.label"),'default':("View Additional Qualifications")],-1)
printHtmlPart(39)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',586,['code':("default.button.show.label"),'default':("View Achievements")],-1)
printHtmlPart(40)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',592,['code':("default.button.show.label"),'default':("View special Attainment")],-1)
printHtmlPart(41)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',598,['code':("default.button.show.label"),'default':("View Patent / Technology / App Developed")],-1)
printHtmlPart(42)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',604,['code':("default.button.show.label"),'default':("View Externally Funded Projects")],-1)
printHtmlPart(43)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',608,['code':("default.button.show.label"),'default':("View Workshops / Trainings")],-1)
printHtmlPart(44)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',613,['code':("default.button.show.label"),'default':("View Confidential Reports")],-1)
printHtmlPart(45)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "woman"))
printHtmlPart(26)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "ruralstdy"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "exServiceMan"))
printHtmlPart(46)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "kannadaMedium"))
printHtmlPart(47)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "pwd"))
printHtmlPart(46)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "j371"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: formDetailInstance, field: "hkRDNO"))
printHtmlPart(34)
invokeTag('formatDate','g',643,['date':(formDetailInstance?.hkIssueDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(48)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',651,['code':("default.button.show.label"),'default':("View Experience")],-1)
printHtmlPart(49)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',657,['code':("default.button.show.label"),'default':("View Scientific Publication")],-1)
printHtmlPart(50)
expressionOut.print(i)
printHtmlPart(38)
invokeTag('message','g',663,['code':("default.button.show.label"),'default':("View Medal / Awards / Recognition")],-1)
printHtmlPart(51)
createTagBody(3, {->
printHtmlPart(52)
invokeTag('hiddenField','g',668,['name':("userListid"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(53)
createClosureForHtmlPart(54, 4)
invokeTag('ifAnyGranted','sec',669,['roles':("ROLE_ADMIN")],4)
printHtmlPart(55)
createTagBody(4, {->
printHtmlPart(56)
invokeTag('message','g',678,['code':("default.button.Report Print.label"),'default':("Application Status")],-1)
printHtmlPart(54)
})
invokeTag('link','g',678,['class':("btn btn-transparent green btn-outline btn-circle btn-sm active"),'action':("report"),'resource':(formDetailInstance)],4)
printHtmlPart(57)
createTagBody(4, {->
printHtmlPart(54)
invokeTag('message','g',684,['code':("default.button.show.label"),'default':("Details of the Application")],-1)
printHtmlPart(56)
})
invokeTag('link','g',684,['class':("btn btn-transparent red btn-outline btn-circle btn-sm active"),'action':("show"),'resource':(formDetailInstance),'target':("_blank")],4)
printHtmlPart(58)
})
invokeTag('formRemote','g',686,['name':("kk"),'url':([action:'adminEdit']),'update':("update1")],3)
printHtmlPart(59)
i++
}
}
printHtmlPart(60)
expressionOut.print(i)
printHtmlPart(61)
createTagBody(2, {->
printHtmlPart(62)
invokeTag('hiddenField','g',699,['name':("userListid"),'value':(usersInstance?.id)],-1)
printHtmlPart(63)
invokeTag('submitButton','g',704,['name':("Edit"),'class':("btn btn-primary")],-1)
printHtmlPart(64)
})
invokeTag('formRemote','g',706,['name':("kk"),'url':([action:'manualPayment']),'update':("update1")],2)
printHtmlPart(65)
expressionOut.print(PaymentInfoInstance)
printHtmlPart(66)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(67)
expressionOut.print(i)
printHtmlPart(68)
loop:{
int l = 0
for( loc11 in (formDetailInstance?.otherDegrees1) ) {
printHtmlPart(69)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(70)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(71)
expressionOut.print(loc11?.additionalType)
printHtmlPart(72)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(73)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(74)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(75)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(76)
}
printHtmlPart(77)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(79)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(80)
expressionOut.print(i)
printHtmlPart(81)
loop:{
int l = 0
for( loc221 in (formDetailInstance?.achievements1) ) {
printHtmlPart(69)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(82)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(83)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(84)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(85)
expressionOut.print(loc221?.level)
printHtmlPart(86)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(88)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(89)
expressionOut.print(i)
printHtmlPart(90)
loop:{
int l = 0
for( loc2221 in (formDetailInstance?.specialAttainment1) ) {
printHtmlPart(69)
if(true && (loc2221?.particular || loc2221?.cadre || loc2221?.year || loc2221?.details  != null)) {
printHtmlPart(91)
expressionOut.print(loc2221?.particular)
printHtmlPart(92)
expressionOut.print(loc2221?.cadre)
printHtmlPart(93)
expressionOut.print(loc2221?.year)
printHtmlPart(94)
expressionOut.print(loc2221?.details)
printHtmlPart(86)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(95)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(96)
expressionOut.print(i)
printHtmlPart(97)
loop:{
int l = 0
for( loc22221 in (formDetailInstance?.patent1) ) {
printHtmlPart(9)
if(true && (loc22221?.details1 || loc22221?.year1  != null)) {
printHtmlPart(98)
expressionOut.print(loc22221?.details1)
printHtmlPart(99)
expressionOut.print(loc22221?.year1)
printHtmlPart(100)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(101)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(102)
expressionOut.print(i)
printHtmlPart(103)
loop:{
int l = 0
for( locs1 in (formDetailInstance?.fproject) ) {
printHtmlPart(69)
if(true && (locs1?.projectTitle || locs1?.cadre2 || locs1?.details2 || locs1?.projectOutlay  != null)) {
printHtmlPart(104)
expressionOut.print(locs1?.projectTitle)
printHtmlPart(92)
expressionOut.print(locs1?.cadre2)
printHtmlPart(105)
expressionOut.print(locs1?.details2)
printHtmlPart(106)
expressionOut.print(locs1?.projectOutlay)
printHtmlPart(86)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(107)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(108)
expressionOut.print(i)
printHtmlPart(109)
loop:{
int l = 0
for( locs11 in (formDetailInstance?.wshop) ) {
printHtmlPart(69)
if(true && (locs11?.particulars3 || locs11?.level3 || locs11?.year3 || locs11?.details3 || locs11?.type10 != null)) {
printHtmlPart(110)
expressionOut.print(locs11?.particulars3)
printHtmlPart(111)
expressionOut.print(locs11?.level3)
printHtmlPart(105)
expressionOut.print(locs11?.details3)
printHtmlPart(112)
expressionOut.print(locs11?.year3)
printHtmlPart(113)
expressionOut.print(locs11?.type10)
printHtmlPart(114)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(115)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(116)
expressionOut.print(i)
printHtmlPart(117)
loop:{
int l = 0
for( locs111 in (formDetailInstance?.creports) ) {
printHtmlPart(9)
if(true && (locs111?.year4 || locs111?.grade   != null)) {
printHtmlPart(118)
expressionOut.print(locs111?.year4)
printHtmlPart(119)
expressionOut.print(locs111?.grade)
printHtmlPart(120)
expressionOut.print(locs111?.cadre6)
printHtmlPart(100)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(115)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(121)
expressionOut.print(i)
printHtmlPart(122)
loop:{
int l = 0
for( loc31 in (formDetailInstance?.experiences1) ) {
printHtmlPart(69)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(123)
expressionOut.print(loc31?.workExperience)
printHtmlPart(124)
expressionOut.print(loc31?.companyName)
printHtmlPart(125)
expressionOut.print(loc31?.postHeld)
printHtmlPart(126)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(127)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(128)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(129)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(130)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(131)
expressionOut.print(loc31?.basicPay)
printHtmlPart(132)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(133)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(134)
expressionOut.print(i)
printHtmlPart(135)
loop:{
int l = 0
for( loc in (formDetailInstance?.sp) ) {
printHtmlPart(69)
if(true && (loc?.particulars || loc?.titlesPapers || loc?.publisher  || loc?.types || loc?.detailsss != null)) {
printHtmlPart(136)
expressionOut.print(loc?.particulars)
printHtmlPart(137)
expressionOut.print(loc?.titlesPapers)
printHtmlPart(138)
expressionOut.print(loc?.publisher)
printHtmlPart(139)
expressionOut.print(loc?.types)
printHtmlPart(140)
expressionOut.print(loc?.detailsss)
printHtmlPart(86)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(141)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(142)
expressionOut.print(i)
printHtmlPart(143)
loop:{
int l = 0
for( loc111 in (formDetailInstance?.specialAwards2) ) {
printHtmlPart(69)
if(true && (loc111?.particularsAwards || loc111?.noofAwards || loc111.awardsYear || loc111?.awardedfor != null)) {
printHtmlPart(136)
expressionOut.print(loc111?.particularsAwards)
printHtmlPart(144)
expressionOut.print(loc111?.noofAwards)
printHtmlPart(145)
expressionOut.print(loc111.awardsYear)
printHtmlPart(146)
expressionOut.print(loc111?.awardedfor)
printHtmlPart(86)
}
printHtmlPart(87)
l++
}
}
printHtmlPart(78)
i++
}
}
printHtmlPart(147)
})
invokeTag('captureBody','sitemesh',1617,['class':("page-container-bg-solid")],1)
printHtmlPart(148)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1749494958031L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
