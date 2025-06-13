import com.hiideals.jobForm.FormDetail
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_svj_formDetailindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/formDetail/index.gsp" }
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
invokeTag('link','g',178,['controller':("superadmin"),'action':("indexx")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',179,['roles':("ROLE_ADMIN")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(7)
createClosureForHtmlPart(8, 3)
invokeTag('link','g',185,['controller':("superadmin"),'action':("dashboard")],3)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',186,['roles':("ROLE_COMMANUSERS")],2)
printHtmlPart(11)
invokeTag('render','g',191,['template':("/header/topBar")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
expressionOut.print(i+1)
printHtmlPart(15)
invokeTag('set','g',239,['var':("user"),'value':(formDetailInstance?.achievements1)],-1)
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null && formDetailInstance?.sslc != null &&  user.size() != 0 && formDetailInstance?.picture != null)) {
printHtmlPart(17)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(18)
}
printHtmlPart(19)
}
else {
printHtmlPart(20)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo == null)) {
printHtmlPart(21)
createTagBody(4, {->
printHtmlPart(22)
invokeTag('message','g',266,['code':("default.button.Report Print.label"),'default':("Application Status")],-1)
printHtmlPart(23)
})
invokeTag('link','g',266,['class':("btn "),'action':("create"),'resource':(formDetailInstance)],4)
printHtmlPart(24)
}
else {
printHtmlPart(25)
expressionOut.print(i)
printHtmlPart(26)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null)) {
printHtmlPart(17)
if(true && (formDetailInstance?.sslc == null)) {
printHtmlPart(27)
createTagBody(5, {->
printHtmlPart(28)
invokeTag('message','g',291,['code':("default.button.Report Print.label"),'default':("Add Education Details")],-1)
printHtmlPart(29)
})
invokeTag('link','g',291,['class':("btn "),'action':("createEducations"),'resource':(formDetailInstance)],5)
printHtmlPart(30)
}
else {
printHtmlPart(31)
expressionOut.print(i)
printHtmlPart(32)
}
printHtmlPart(16)
}
else {
printHtmlPart(33)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null && formDetailInstance?.sslc != null)) {
printHtmlPart(19)
invokeTag('set','g',316,['var':("user"),'value':(formDetailInstance?.achievements1)],-1)
printHtmlPart(34)
if(true && (user.size() == 0)) {
printHtmlPart(35)
createTagBody(5, {->
printHtmlPart(28)
invokeTag('message','g',332,['code':("default.button.Report Print.label"),'default':("Add More Details")],-1)
printHtmlPart(29)
})
invokeTag('link','g',333,['class':("btn "),'action':("createAddmore"),'resource':(formDetailInstance)],5)
printHtmlPart(36)
}
else {
printHtmlPart(37)
expressionOut.print(i)
printHtmlPart(38)
}
printHtmlPart(24)
}
else {
printHtmlPart(39)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null && formDetailInstance?.sslc != null &&  user.size() != 0)) {
printHtmlPart(17)
if(true && (formDetailInstance?.picture == null)) {
printHtmlPart(27)
createTagBody(5, {->
printHtmlPart(28)
invokeTag('message','g',367,['code':("default.button.Report Print.label"),'default':("Upload Documents")],-1)
printHtmlPart(29)
})
invokeTag('link','g',368,['class':("btn"),'action':("createdocumentss"),'resource':(formDetailInstance)],5)
printHtmlPart(40)
}
else {
printHtmlPart(41)
expressionOut.print(i)
printHtmlPart(42)
}
printHtmlPart(16)
}
else {
printHtmlPart(43)
}
printHtmlPart(16)
if(true && (formDetailInstance?.apllicationNo != null && formDetailInstance?.sslc != null &&  user.size() != 0 && formDetailInstance?.picture != null)) {
printHtmlPart(21)
createTagBody(4, {->
printHtmlPart(22)
invokeTag('hiddenField','g',394,['name':("userListid"),'value':(formDetailInstance?.id)],-1)
printHtmlPart(44)
createTagBody(5, {->
printHtmlPart(29)
createTagBody(6, {->
printHtmlPart(28)
invokeTag('message','g',401,['code':("default.button.edit.label"),'default':("Edit")],-1)
printHtmlPart(29)
})
invokeTag('link','g',402,['class':("btn btn-primary"),'action':("edit"),'resource':(formDetailInstance)],6)
printHtmlPart(22)
})
invokeTag('ifAnyGranted','sec',403,['roles':("ROLE_ADMIN")],5)
printHtmlPart(44)
createTagBody(5, {->
printHtmlPart(29)
invokeTag('message','g',408,['code':("default.button.Report Print.label"),'default':("Application Status")],-1)
printHtmlPart(22)
})
invokeTag('link','g',411,['class':("btn btn-transparent green btn-outline btn-circle btn-sm active"),'action':("report"),'resource':(formDetailInstance)],5)
printHtmlPart(45)
createTagBody(5, {->
printHtmlPart(29)
invokeTag('message','g',417,['code':("default.button.show.label"),'default':("Details of the Application")],-1)
printHtmlPart(28)
})
invokeTag('link','g',420,['class':("btn btn-transparent red btn-outline btn-circle btn-sm active"),'action':("show"),'resource':(formDetailInstance),'target':("_blank")],5)
printHtmlPart(23)
})
invokeTag('formRemote','g',421,['name':("kk"),'url':([action:'adminEdit']),'update':("update1")],4)
printHtmlPart(24)
}
else {
printHtmlPart(20)
}
printHtmlPart(46)
i++
}
}
printHtmlPart(47)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(48)
expressionOut.print(i)
printHtmlPart(49)
expressionOut.print(formDetailInstance?.apllicationNo)
printHtmlPart(50)
expressionOut.print(formDetailInstance?.appliyingPost)
printHtmlPart(51)
expressionOut.print(formDetailInstance?.appliyingSub)
printHtmlPart(52)
expressionOut.print(formDetailInstance?.firstName)
printHtmlPart(53)
expressionOut.print(formDetailInstance?.lastName)
printHtmlPart(54)
expressionOut.print(formDetailInstance?.fName)
printHtmlPart(55)
expressionOut.print(formDetailInstance?.mName)
printHtmlPart(56)
expressionOut.print(formDetailInstance?.gender)
printHtmlPart(57)
invokeTag('formatDate','g',517,['date':(formDetailInstance.dob),'format':("mm-dd-yyyy")],-1)
printHtmlPart(58)
expressionOut.print(formDetailInstance?.email)
printHtmlPart(59)
expressionOut.print(formDetailInstance?.phoneNumber)
printHtmlPart(60)
expressionOut.print(formDetailInstance?.hNo)
printHtmlPart(61)
expressionOut.print(formDetailInstance?.street)
printHtmlPart(62)
expressionOut.print(formDetailInstance?.village)
printHtmlPart(63)
expressionOut.print(formDetailInstance?.taluka)
printHtmlPart(64)
expressionOut.print(formDetailInstance?.district)
printHtmlPart(65)
expressionOut.print(formDetailInstance?.state)
printHtmlPart(66)
expressionOut.print(formDetailInstance?.pinCode)
printHtmlPart(67)
expressionOut.print(formDetailInstance?.country)
printHtmlPart(68)
expressionOut.print(formDetailInstance?.socialcategory)
printHtmlPart(69)
expressionOut.print(formDetailInstance?.subcast)
printHtmlPart(70)
expressionOut.print(formDetailInstance?.religion)
printHtmlPart(71)
expressionOut.print(formDetailInstance?.kvcNo)
printHtmlPart(72)
invokeTag('formatDate','g',604,['date':(formDetailInstance.fvcDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(73)
expressionOut.print(formDetailInstance?.neteducation)
printHtmlPart(74)
expressionOut.print(formDetailInstance?.age)
printHtmlPart(75)
expressionOut.print(formDetailInstance?.ageRelax)
printHtmlPart(76)
expressionOut.print(formDetailInstance?.ageCat)
printHtmlPart(77)
expressionOut.print(formDetailInstance?.woman)
printHtmlPart(78)
expressionOut.print(formDetailInstance?.ruralstdy)
printHtmlPart(79)
expressionOut.print(formDetailInstance?.exServiceMan)
printHtmlPart(80)
expressionOut.print(formDetailInstance?.kannadaMedium)
printHtmlPart(81)
expressionOut.print(formDetailInstance?.pwd)
printHtmlPart(82)
expressionOut.print(formDetailInstance?.j371)
printHtmlPart(83)
invokeTag('formatDate','g',699,['date':(formDetailInstance.hkIssueDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(84)
expressionOut.print(formDetailInstance?.hkRDNO)
printHtmlPart(85)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(17)
createClosureForHtmlPart(86, 4)
invokeTag('form','g',726,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(16)
}
else {
printHtmlPart(17)
createClosureForHtmlPart(87, 4)
invokeTag('link','g',731,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(16)
}
printHtmlPart(88)
i++
}
}
printHtmlPart(89)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(90)
expressionOut.print(i)
printHtmlPart(91)
expressionOut.print(formDetailInstance?.sslc)
printHtmlPart(92)
expressionOut.print(formDetailInstance?.obtainedsslc)
printHtmlPart(93)
expressionOut.print(formDetailInstance?.maximumsslc)
printHtmlPart(94)
expressionOut.print(formDetailInstance?.percentagesslc)
printHtmlPart(95)
invokeTag('formatDate','g',813,['date':(formDetailInstance.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(96)
expressionOut.print(formDetailInstance?.boardUniversitysslc)
printHtmlPart(97)
expressionOut.print(formDetailInstance?.puc)
printHtmlPart(92)
expressionOut.print(formDetailInstance?.obtainedpuc)
printHtmlPart(93)
expressionOut.print(formDetailInstance?.maximumpuc)
printHtmlPart(94)
expressionOut.print(formDetailInstance?.percentagepuc)
printHtmlPart(98)
invokeTag('formatDate','g',865,['date':(formDetailInstance.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(96)
expressionOut.print(formDetailInstance?.boardUniversitypuc)
printHtmlPart(99)
expressionOut.print(formDetailInstance?.kannadaLanguage)
printHtmlPart(100)
expressionOut.print(formDetailInstance?.kpsckannadaexam)
printHtmlPart(101)
expressionOut.print(formDetailInstance?.degreeNameBachelors)
printHtmlPart(102)
expressionOut.print(formDetailInstance?.bachelorsDegree)
printHtmlPart(103)
expressionOut.print(formDetailInstance?.percentagebachelorsDegree)
printHtmlPart(104)
invokeTag('formatDate','g',929,['date':(formDetailInstance.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(105)
expressionOut.print(formDetailInstance?.boardUniversitybachelorsDegree)
printHtmlPart(106)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(107)
if(true && (formDetailInstance?.subjectMaster != "")) {
printHtmlPart(108)
expressionOut.print(formDetailInstance?.subjectMaster)
printHtmlPart(109)
}
printHtmlPart(110)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(111)
expressionOut.print(formDetailInstance?.mastersDegree)
printHtmlPart(109)
}
printHtmlPart(112)
if(true && (formDetailInstance?.percentagemastersDegree != "")) {
printHtmlPart(113)
expressionOut.print(formDetailInstance?.percentagemastersDegree)
printHtmlPart(109)
}
printHtmlPart(110)
if(true && (formDetailInstance.mastersDegreeyear != null)) {
printHtmlPart(114)
invokeTag('formatDate','g',995,['date':(formDetailInstance.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(115)
}
printHtmlPart(112)
if(true && (formDetailInstance?.boardUniversitymastersDegree != "")) {
printHtmlPart(116)
expressionOut.print(formDetailInstance?.boardUniversitymastersDegree)
printHtmlPart(109)
}
printHtmlPart(117)
}
printHtmlPart(118)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(119)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(111)
expressionOut.print(formDetailInstance?.pHD)
printHtmlPart(109)
}
printHtmlPart(110)
if(true && (formDetailInstance?.percentagepHD != "")) {
printHtmlPart(120)
expressionOut.print(formDetailInstance?.percentagepHD)
printHtmlPart(109)
}
printHtmlPart(112)
if(true && (formDetailInstance?.pHDSubject != "")) {
printHtmlPart(121)
expressionOut.print(formDetailInstance?.pHDSubject)
printHtmlPart(109)
}
printHtmlPart(110)
if(true && (formDetailInstance.pHDyear != null)) {
printHtmlPart(114)
invokeTag('formatDate','g',1051,['date':(formDetailInstance.pHDyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(115)
}
printHtmlPart(112)
if(true && (formDetailInstance?.boardUniversitypHD != "")) {
printHtmlPart(116)
expressionOut.print(formDetailInstance?.boardUniversitypHD)
printHtmlPart(109)
}
printHtmlPart(122)
}
printHtmlPart(123)
loop:{
int l = 0
for( loc11 in (formDetailInstance?.otherDegrees1) ) {
printHtmlPart(124)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(125)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(126)
expressionOut.print(loc11?.additionalType)
printHtmlPart(127)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(128)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(129)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(130)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(131)
}
printHtmlPart(132)
l++
}
}
printHtmlPart(133)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(110)
createClosureForHtmlPart(134, 4)
invokeTag('form','g',1133,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(110)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(135, 4)
invokeTag('link','g',1137,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(136)
}
printHtmlPart(137)
i++
}
}
printHtmlPart(138)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(139)
expressionOut.print(i)
printHtmlPart(140)
loop:{
int l = 0
for( loc221 in (formDetailInstance?.achievements1) ) {
printHtmlPart(124)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(141)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(142)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(143)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(144)
expressionOut.print(loc221?.level)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(147)
loop:{
int l = 0
for( loc2221 in (formDetailInstance?.specialAttainment1) ) {
printHtmlPart(124)
if(true && (loc2221?.particular || loc2221?.cadre || loc2221?.year || loc2221?.details  != null)) {
printHtmlPart(148)
expressionOut.print(loc2221?.particular)
printHtmlPart(149)
expressionOut.print(loc2221?.cadre)
printHtmlPart(150)
expressionOut.print(loc2221?.year)
printHtmlPart(151)
expressionOut.print(loc2221?.details)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(152)
loop:{
int l = 0
for( loc22221 in (formDetailInstance?.patent1) ) {
printHtmlPart(9)
if(true && (loc22221?.details1 || loc22221?.year1  != null)) {
printHtmlPart(153)
expressionOut.print(loc22221?.details1)
printHtmlPart(154)
expressionOut.print(loc22221?.year1)
printHtmlPart(155)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(156)
loop:{
int l = 0
for( locs1 in (formDetailInstance?.fproject) ) {
printHtmlPart(124)
if(true && (locs1?.projectTitle || locs1?.cadre2 || locs1?.details2 || locs1?.projectOutlay  != null)) {
printHtmlPart(157)
expressionOut.print(locs1?.projectTitle)
printHtmlPart(149)
expressionOut.print(locs1?.cadre2)
printHtmlPart(158)
expressionOut.print(locs1?.details2)
printHtmlPart(159)
expressionOut.print(locs1?.projectOutlay)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(160)
loop:{
int l = 0
for( locs11 in (formDetailInstance?.wshop) ) {
printHtmlPart(124)
if(true && (locs11?.particulars3 || locs11?.level3 || locs11?.year3 || locs11?.details3  != null)) {
printHtmlPart(161)
expressionOut.print(locs11?.particulars3)
printHtmlPart(162)
expressionOut.print(locs11?.level3)
printHtmlPart(158)
expressionOut.print(locs11?.details3)
printHtmlPart(163)
expressionOut.print(locs11?.year3)
printHtmlPart(164)
expressionOut.print(locs11?.type10)
printHtmlPart(165)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(166)
loop:{
int l = 0
for( loc31 in (formDetailInstance?.experiences1) ) {
printHtmlPart(124)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(167)
expressionOut.print(loc31?.workExperience)
printHtmlPart(168)
expressionOut.print(loc31?.companyName)
printHtmlPart(169)
expressionOut.print(loc31?.postHeld)
printHtmlPart(170)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(171)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(172)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(173)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(174)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(175)
expressionOut.print(loc31?.basicPay)
printHtmlPart(176)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(177)
loop:{
int l = 0
for( loc in (formDetailInstance?.sp) ) {
printHtmlPart(124)
if(true && (loc?.particulars || loc?.titlesPapers || loc?.publisher  || loc?.types || loc?.detailsss != null)) {
printHtmlPart(178)
expressionOut.print(loc?.particulars)
printHtmlPart(179)
expressionOut.print(loc?.titlesPapers)
printHtmlPart(180)
expressionOut.print(loc?.publisher)
printHtmlPart(181)
expressionOut.print(loc?.types)
printHtmlPart(182)
expressionOut.print(loc?.detailsss)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(183)
loop:{
int l = 0
for( loc111 in (formDetailInstance?.specialAwards2) ) {
printHtmlPart(124)
if(true && (loc111?.particularsAwards || loc111?.noofAwards || loc111.awardsYear || loc111?.awardedfor != null)) {
printHtmlPart(178)
expressionOut.print(loc111?.particularsAwards)
printHtmlPart(184)
expressionOut.print(loc111?.noofAwards)
printHtmlPart(185)
expressionOut.print(loc111.awardsYear)
printHtmlPart(186)
expressionOut.print(loc111?.awardedfor)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(187)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(110)
createClosureForHtmlPart(134, 4)
invokeTag('form','g',1558,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(110)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(135, 4)
invokeTag('link','g',1565,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(136)
}
printHtmlPart(188)
i++
}
}
printHtmlPart(189)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(190)
expressionOut.print(i)
printHtmlPart(191)
if(true && (formDetailInstance?.picture?.id != null)) {
printHtmlPart(192)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(194)
}
printHtmlPart(195)
if(true && (formDetailInstance?.signature?.id != null)) {
printHtmlPart(196)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(197)
}
printHtmlPart(198)
if(true && (formDetailInstance?.sslcMarksSheet?.id != null)) {
printHtmlPart(199)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(200)
}
printHtmlPart(195)
if(true && (formDetailInstance?.pucMarksSheet?.id != null)) {
printHtmlPart(201)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(202)
}
printHtmlPart(203)
if(true && (formDetailInstance?.bachelorsMarksSheet?.id != null)) {
printHtmlPart(204)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(200)
}
printHtmlPart(205)
if(true && (formDetailInstance?.ugPDC?.id != null)) {
printHtmlPart(206)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(200)
}
printHtmlPart(207)
if(true && (formDetailInstance?.masterMarksSheet?.id != null)) {
printHtmlPart(208)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(202)
}
printHtmlPart(209)
if(true && (formDetailInstance?.pgPDC?.id != null)) {
printHtmlPart(210)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(202)
}
printHtmlPart(211)
if(true && (formDetailInstance?.phDCertificate?.id != null)) {
printHtmlPart(212)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(200)
}
printHtmlPart(205)
if(true && (formDetailInstance?.phdPDc?.id != null)) {
printHtmlPart(213)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(200)
}
printHtmlPart(214)
if(true && (formDetailInstance?.nETCertificate?.id != null)) {
printHtmlPart(215)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(202)
}
printHtmlPart(216)
if(true && (formDetailInstance?.experienceCertificate?.id != null)) {
printHtmlPart(217)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(202)
}
printHtmlPart(218)
if(true && (formDetailInstance?.casteIncomeCertificate?.id != null)) {
printHtmlPart(219)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(200)
}
printHtmlPart(195)
if(true && (formDetailInstance?.ruralCertificate?.id != null)) {
printHtmlPart(220)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(202)
}
printHtmlPart(203)
if(true && (formDetailInstance?.exServicemenCertificate?.id != null)) {
printHtmlPart(221)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(200)
}
printHtmlPart(222)
if(true && (formDetailInstance?.kannadaMediumCertificate?.id != null)) {
printHtmlPart(223)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(202)
}
printHtmlPart(224)
if(true && (formDetailInstance?.kpsckannadaCertificate?.id != null)) {
printHtmlPart(225)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(202)
}
printHtmlPart(226)
if(true && (formDetailInstance?.kalyanaKarnatakaCertificate?.id != null)) {
printHtmlPart(227)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(200)
}
printHtmlPart(228)
if(true && (formDetailInstance?.personwithDisabilityCertificate?.id != null)) {
printHtmlPart(229)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(202)
}
printHtmlPart(203)
if(true && (formDetailInstance?.kVCCertificate?.id != null)) {
printHtmlPart(230)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(200)
}
printHtmlPart(205)
if(true && (formDetailInstance?.kvc2?.id != null)) {
printHtmlPart(231)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(200)
}
printHtmlPart(232)
if(true && (formDetailInstance?.ageRelax1?.id != null)) {
printHtmlPart(233)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ageRelax1?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ageRelax1?.id))
printHtmlPart(234)
}
printHtmlPart(235)
if(true && (formDetailInstance?.uploade10?.id != null)) {
printHtmlPart(236)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(237)
}
printHtmlPart(238)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(110)
createClosureForHtmlPart(239, 4)
invokeTag('form','g',1944,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(110)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(135, 4)
invokeTag('link','g',1947,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(136)
}
printHtmlPart(188)
i++
}
}
printHtmlPart(240)
loop:{
int i = 0
for( formDetailInstance in (formdet?.reverse()) ) {
printHtmlPart(241)
expressionOut.print(i)
printHtmlPart(242)
expressionOut.print(formDetailInstance?.apllicationNo)
printHtmlPart(243)
expressionOut.print(formDetailInstance?.appliyingPost)
printHtmlPart(244)
expressionOut.print(formDetailInstance?.appliyingSub)
printHtmlPart(245)
expressionOut.print(formDetailInstance?.firstName)
printHtmlPart(246)
expressionOut.print(formDetailInstance?.lastName)
printHtmlPart(247)
expressionOut.print(formDetailInstance?.fName)
printHtmlPart(248)
expressionOut.print(formDetailInstance?.mName)
printHtmlPart(249)
expressionOut.print(formDetailInstance?.gender)
printHtmlPart(250)
invokeTag('formatDate','g',2024,['date':(formDetailInstance.dob),'format':("mm-dd-yyyy")],-1)
printHtmlPart(251)
expressionOut.print(formDetailInstance?.email)
printHtmlPart(252)
expressionOut.print(formDetailInstance?.phoneNumber)
printHtmlPart(253)
expressionOut.print(formDetailInstance?.hNo)
printHtmlPart(254)
expressionOut.print(formDetailInstance?.street)
printHtmlPart(255)
expressionOut.print(formDetailInstance?.village)
printHtmlPart(256)
expressionOut.print(formDetailInstance?.taluka)
printHtmlPart(257)
expressionOut.print(formDetailInstance?.district)
printHtmlPart(258)
expressionOut.print(formDetailInstance?.state)
printHtmlPart(259)
expressionOut.print(formDetailInstance?.pinCode)
printHtmlPart(260)
expressionOut.print(formDetailInstance?.country)
printHtmlPart(261)
expressionOut.print(formDetailInstance?.socialcategory)
printHtmlPart(262)
expressionOut.print(formDetailInstance?.subcast)
printHtmlPart(263)
expressionOut.print(formDetailInstance?.religion)
printHtmlPart(264)
expressionOut.print(formDetailInstance?.kvcNo)
printHtmlPart(265)
invokeTag('formatDate','g',2071,['date':(formDetailInstance.fvcDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(266)
expressionOut.print(formDetailInstance?.neteducation)
printHtmlPart(267)
expressionOut.print(formDetailInstance?.age)
printHtmlPart(268)
expressionOut.print(formDetailInstance?.ageRelax)
printHtmlPart(269)
expressionOut.print(formDetailInstance?.ageCat)
printHtmlPart(270)
expressionOut.print(formDetailInstance?.woman)
printHtmlPart(271)
expressionOut.print(formDetailInstance?.ruralstdy)
printHtmlPart(272)
expressionOut.print(formDetailInstance?.exServiceMan)
printHtmlPart(273)
expressionOut.print(formDetailInstance?.kannadaMedium)
printHtmlPart(274)
expressionOut.print(formDetailInstance?.pwd)
printHtmlPart(275)
expressionOut.print(formDetailInstance?.j371)
printHtmlPart(276)
invokeTag('formatDate','g',2141,['date':(formDetailInstance.hkIssueDate),'format':("dd-MM-yyyy")],-1)
printHtmlPart(277)
expressionOut.print(formDetailInstance?.hkRDNO)
printHtmlPart(278)
expressionOut.print(formDetailInstance?.sslc)
printHtmlPart(92)
expressionOut.print(formDetailInstance?.obtainedsslc)
printHtmlPart(93)
expressionOut.print(formDetailInstance?.maximumsslc)
printHtmlPart(94)
expressionOut.print(formDetailInstance?.percentagesslc)
printHtmlPart(95)
invokeTag('formatDate','g',2207,['date':(formDetailInstance.sslcyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(96)
expressionOut.print(formDetailInstance?.boardUniversitysslc)
printHtmlPart(279)
expressionOut.print(formDetailInstance?.kannadaLanguage)
printHtmlPart(100)
expressionOut.print(formDetailInstance?.kpsckannadaexam)
printHtmlPart(280)
expressionOut.print(formDetailInstance?.puc)
printHtmlPart(92)
expressionOut.print(formDetailInstance?.obtainedpuc)
printHtmlPart(93)
expressionOut.print(formDetailInstance?.maximumpuc)
printHtmlPart(94)
expressionOut.print(formDetailInstance?.percentagepuc)
printHtmlPart(98)
invokeTag('formatDate','g',2286,['date':(formDetailInstance.pucyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(96)
expressionOut.print(formDetailInstance?.boardUniversitypuc)
printHtmlPart(101)
expressionOut.print(formDetailInstance?.degreeNameBachelors)
printHtmlPart(102)
expressionOut.print(formDetailInstance?.bachelorsDegree)
printHtmlPart(103)
expressionOut.print(formDetailInstance?.percentagebachelorsDegree)
printHtmlPart(104)
invokeTag('formatDate','g',2331,['date':(formDetailInstance.bachelorsDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(105)
expressionOut.print(formDetailInstance?.boardUniversitybachelorsDegree)
printHtmlPart(106)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(107)
if(true && (formDetailInstance?.subjectMaster != "")) {
printHtmlPart(108)
expressionOut.print(formDetailInstance?.subjectMaster)
printHtmlPart(109)
}
printHtmlPart(110)
if(true && (formDetailInstance?.mastersDegree != "")) {
printHtmlPart(111)
expressionOut.print(formDetailInstance?.mastersDegree)
printHtmlPart(109)
}
printHtmlPart(112)
if(true && (formDetailInstance?.percentagemastersDegree != "")) {
printHtmlPart(113)
expressionOut.print(formDetailInstance?.percentagemastersDegree)
printHtmlPart(109)
}
printHtmlPart(110)
if(true && (formDetailInstance.mastersDegreeyear != null)) {
printHtmlPart(114)
invokeTag('formatDate','g',2392,['date':(formDetailInstance.mastersDegreeyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(115)
}
printHtmlPart(112)
if(true && (formDetailInstance?.boardUniversitymastersDegree != "")) {
printHtmlPart(116)
expressionOut.print(formDetailInstance?.boardUniversitymastersDegree)
printHtmlPart(109)
}
printHtmlPart(117)
}
printHtmlPart(118)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(119)
if(true && (formDetailInstance?.pHD != "")) {
printHtmlPart(111)
expressionOut.print(formDetailInstance?.pHD)
printHtmlPart(109)
}
printHtmlPart(110)
if(true && (formDetailInstance?.percentagepHD != "")) {
printHtmlPart(120)
expressionOut.print(formDetailInstance?.percentagepHD)
printHtmlPart(109)
}
printHtmlPart(112)
if(true && (formDetailInstance?.pHDSubject != "")) {
printHtmlPart(121)
expressionOut.print(formDetailInstance?.pHDSubject)
printHtmlPart(109)
}
printHtmlPart(110)
if(true && (formDetailInstance.pHDyear != null)) {
printHtmlPart(114)
invokeTag('formatDate','g',2454,['date':(formDetailInstance.pHDyear),'format':("dd-MM-yyyy")],-1)
printHtmlPart(115)
}
printHtmlPart(112)
if(true && (formDetailInstance?.boardUniversitypHD != "")) {
printHtmlPart(116)
expressionOut.print(formDetailInstance?.boardUniversitypHD)
printHtmlPart(109)
}
printHtmlPart(122)
}
printHtmlPart(123)
loop:{
int l = 0
for( loc11 in (formDetailInstance?.otherDegrees1) ) {
printHtmlPart(124)
if(true && (loc11?.nameofDegree || loc11?.additionalType ||loc11?.otherDiploma || loc11?.percentageotherDiploma || loc11.otherDiplomayear || loc11?.boardUniversityotherDiploma  != null)) {
printHtmlPart(125)
expressionOut.print(loc11?.nameofDegree)
printHtmlPart(126)
expressionOut.print(loc11?.additionalType)
printHtmlPart(127)
expressionOut.print(loc11?.otherDiploma)
printHtmlPart(128)
expressionOut.print(loc11?.percentageotherDiploma)
printHtmlPart(129)
expressionOut.print(loc11.otherDiplomayear)
printHtmlPart(130)
expressionOut.print(loc11?.boardUniversityotherDiploma)
printHtmlPart(281)
}
printHtmlPart(132)
l++
}
}
printHtmlPart(282)
loop:{
int l = 0
for( loc221 in (formDetailInstance?.achievements1) ) {
printHtmlPart(124)
if(true && (loc221?.typeAchievement || loc221?.particularsEvent || loc221?.periodDuration || loc221?.level  != null)) {
printHtmlPart(141)
expressionOut.print(loc221?.typeAchievement)
printHtmlPart(142)
expressionOut.print(loc221?.particularsEvent)
printHtmlPart(143)
expressionOut.print(loc221?.periodDuration)
printHtmlPart(144)
expressionOut.print(loc221?.level)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(147)
loop:{
int l = 0
for( loc2221 in (formDetailInstance?.specialAttainment1) ) {
printHtmlPart(124)
if(true && (loc2221?.particular || loc2221?.cadre || loc2221?.year || loc2221?.details  != null)) {
printHtmlPart(148)
expressionOut.print(loc2221?.particular)
printHtmlPart(149)
expressionOut.print(loc2221?.cadre)
printHtmlPart(150)
expressionOut.print(loc2221?.year)
printHtmlPart(151)
expressionOut.print(loc2221?.details)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(152)
loop:{
int l = 0
for( loc22221 in (formDetailInstance?.patent1) ) {
printHtmlPart(9)
if(true && (loc22221?.details1 || loc22221?.year1  != null)) {
printHtmlPart(153)
expressionOut.print(loc22221?.details1)
printHtmlPart(154)
expressionOut.print(loc22221?.year1)
printHtmlPart(155)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(156)
loop:{
int l = 0
for( locs1 in (formDetailInstance?.fproject) ) {
printHtmlPart(124)
if(true && (locs1?.projectTitle || locs1?.cadre2 || locs1?.details2 || locs1?.projectOutlay  != null)) {
printHtmlPart(157)
expressionOut.print(locs1?.projectTitle)
printHtmlPart(149)
expressionOut.print(locs1?.cadre2)
printHtmlPart(158)
expressionOut.print(locs1?.details2)
printHtmlPart(159)
expressionOut.print(locs1?.projectOutlay)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(160)
loop:{
int l = 0
for( locs11 in (formDetailInstance?.wshop) ) {
printHtmlPart(124)
if(true && (locs11?.particulars3 || locs11?.level3 || locs11?.year3 || locs11?.details3  != null)) {
printHtmlPart(161)
expressionOut.print(locs11?.particulars3)
printHtmlPart(162)
expressionOut.print(locs11?.level3)
printHtmlPart(158)
expressionOut.print(locs11?.details3)
printHtmlPart(163)
expressionOut.print(locs11?.year3)
printHtmlPart(164)
expressionOut.print(locs11?.type10)
printHtmlPart(165)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(166)
loop:{
int l = 0
for( loc31 in (formDetailInstance?.experiences1) ) {
printHtmlPart(124)
if(true && (loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null)) {
printHtmlPart(167)
expressionOut.print(loc31?.workExperience)
printHtmlPart(168)
expressionOut.print(loc31?.companyName)
printHtmlPart(169)
expressionOut.print(loc31?.postHeld)
printHtmlPart(170)
expressionOut.print(loc31?.nameOfTheEmployeer)
printHtmlPart(171)
expressionOut.print(loc31?.dateOfJoining)
printHtmlPart(172)
expressionOut.print(loc31?.dateOfLeaving)
printHtmlPart(173)
expressionOut.print(loc31?.periodOfService)
printHtmlPart(174)
expressionOut.print(loc31?.reasonOfLeaving)
printHtmlPart(175)
expressionOut.print(loc31?.basicPay)
printHtmlPart(176)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(177)
loop:{
int l = 0
for( loc in (formDetailInstance?.sp) ) {
printHtmlPart(124)
if(true && (loc?.particulars || loc?.titlesPapers || loc?.publisher  || loc?.types || loc?.detailsss != null)) {
printHtmlPart(178)
expressionOut.print(loc?.particulars)
printHtmlPart(179)
expressionOut.print(loc?.titlesPapers)
printHtmlPart(180)
expressionOut.print(loc?.publisher)
printHtmlPart(181)
expressionOut.print(loc?.types)
printHtmlPart(182)
expressionOut.print(loc?.detailsss)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(183)
loop:{
int l = 0
for( loc111 in (formDetailInstance?.specialAwards2) ) {
printHtmlPart(124)
if(true && (loc111?.particularsAwards || loc111?.noofAwards || loc111.awardsYear || loc111?.awardedfor != null)) {
printHtmlPart(178)
expressionOut.print(loc111?.particularsAwards)
printHtmlPart(184)
expressionOut.print(loc111?.noofAwards)
printHtmlPart(185)
expressionOut.print(loc111.awardsYear)
printHtmlPart(186)
expressionOut.print(loc111?.awardedfor)
printHtmlPart(145)
}
printHtmlPart(146)
l++
}
}
printHtmlPart(283)
if(true && (formDetailInstance?.picture?.id != null)) {
printHtmlPart(192)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.picture?.id))
printHtmlPart(200)
}
printHtmlPart(195)
if(true && (formDetailInstance?.signature?.id != null)) {
printHtmlPart(196)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.signature?.id))
printHtmlPart(197)
}
printHtmlPart(198)
if(true && (formDetailInstance?.sslcMarksSheet?.id != null)) {
printHtmlPart(199)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.sslcMarksSheet?.id))
printHtmlPart(200)
}
printHtmlPart(195)
if(true && (formDetailInstance?.pucMarksSheet?.id != null)) {
printHtmlPart(201)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pucMarksSheet?.id))
printHtmlPart(202)
}
printHtmlPart(203)
if(true && (formDetailInstance?.bachelorsMarksSheet?.id != null)) {
printHtmlPart(204)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.bachelorsMarksSheet?.id))
printHtmlPart(200)
}
printHtmlPart(205)
if(true && (formDetailInstance?.ugPDC?.id != null)) {
printHtmlPart(206)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ugPDC?.id))
printHtmlPart(194)
}
printHtmlPart(207)
if(true && (formDetailInstance?.masterMarksSheet?.id != null)) {
printHtmlPart(208)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.masterMarksSheet?.id))
printHtmlPart(202)
}
printHtmlPart(209)
if(true && (formDetailInstance?.pgPDC?.id != null)) {
printHtmlPart(210)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.pgPDC?.id))
printHtmlPart(202)
}
printHtmlPart(211)
if(true && (formDetailInstance?.phDCertificate?.id != null)) {
printHtmlPart(212)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phDCertificate?.id))
printHtmlPart(194)
}
printHtmlPart(205)
if(true && (formDetailInstance?.phdPDc?.id != null)) {
printHtmlPart(213)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.phdPDc?.id))
printHtmlPart(194)
}
printHtmlPart(214)
if(true && (formDetailInstance?.nETCertificate?.id != null)) {
printHtmlPart(215)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.nETCertificate?.id))
printHtmlPart(284)
}
printHtmlPart(216)
if(true && (formDetailInstance?.experienceCertificate?.id != null)) {
printHtmlPart(217)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.experienceCertificate?.id))
printHtmlPart(284)
}
printHtmlPart(218)
if(true && (formDetailInstance?.casteIncomeCertificate?.id != null)) {
printHtmlPart(219)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.casteIncomeCertificate?.id))
printHtmlPart(194)
}
printHtmlPart(195)
if(true && (formDetailInstance?.ruralCertificate?.id != null)) {
printHtmlPart(220)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ruralCertificate?.id))
printHtmlPart(284)
}
printHtmlPart(203)
if(true && (formDetailInstance?.exServicemenCertificate?.id != null)) {
printHtmlPart(221)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.exServicemenCertificate?.id))
printHtmlPart(194)
}
printHtmlPart(222)
if(true && (formDetailInstance?.kannadaMediumCertificate?.id != null)) {
printHtmlPart(223)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kannadaMediumCertificate?.id))
printHtmlPart(284)
}
printHtmlPart(285)
if(true && (formDetailInstance?.kpsckannadaCertificate?.id != null)) {
printHtmlPart(225)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kpsckannadaCertificate?.id))
printHtmlPart(202)
}
printHtmlPart(286)
if(true && (formDetailInstance?.kalyanaKarnatakaCertificate?.id != null)) {
printHtmlPart(227)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kalyanaKarnatakaCertificate?.id))
printHtmlPart(194)
}
printHtmlPart(228)
if(true && (formDetailInstance?.personwithDisabilityCertificate?.id != null)) {
printHtmlPart(229)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.personwithDisabilityCertificate?.id))
printHtmlPart(202)
}
printHtmlPart(203)
if(true && (formDetailInstance?.kVCCertificate?.id != null)) {
printHtmlPart(287)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kVCCertificate?.id))
printHtmlPart(200)
}
printHtmlPart(205)
if(true && (formDetailInstance?.kvc2?.id != null)) {
printHtmlPart(288)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.kvc2?.id))
printHtmlPart(200)
}
printHtmlPart(289)
if(true && (formDetailInstance?.ageRelax1?.id != null)) {
printHtmlPart(233)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ageRelax1?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.ageRelax1?.id))
printHtmlPart(234)
}
printHtmlPart(290)
if(true && (formDetailInstance?.uploade1?.id != null)) {
printHtmlPart(291)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade1?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade1?.id))
printHtmlPart(200)
}
printHtmlPart(195)
if(true && (formDetailInstance?.uploade2?.id != null)) {
printHtmlPart(292)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade2?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade2?.id))
printHtmlPart(293)
}
printHtmlPart(195)
if(true && (formDetailInstance?.uploade3?.id != null)) {
printHtmlPart(294)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade3?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade3?.id))
printHtmlPart(295)
}
printHtmlPart(195)
if(true && (formDetailInstance?.uploade4?.id != null)) {
printHtmlPart(296)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade4?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade4?.id))
printHtmlPart(297)
}
printHtmlPart(203)
if(true && (formDetailInstance?.uploade5?.id != null)) {
printHtmlPart(298)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade5?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade5?.id))
printHtmlPart(295)
}
printHtmlPart(195)
if(true && (formDetailInstance?.uploade6?.id != null)) {
printHtmlPart(299)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade6?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade6?.id))
printHtmlPart(297)
}
printHtmlPart(300)
if(true && (formDetailInstance?.uploade7?.id != null)) {
printHtmlPart(301)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade7?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade7?.id))
printHtmlPart(295)
}
printHtmlPart(110)
if(true && (formDetailInstance?.uploade8?.id != null)) {
printHtmlPart(302)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade8?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade8?.id))
printHtmlPart(297)
}
printHtmlPart(303)
if(true && (formDetailInstance?.uploade9?.id != null)) {
printHtmlPart(304)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade9?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade9?.id))
printHtmlPart(295)
}
printHtmlPart(195)
if(true && (formDetailInstance?.uploade10?.id != null)) {
printHtmlPart(236)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(193)
expressionOut.print(createLink(controller:'formDetail', action:'viewimg', id:formDetailInstance?.uploade10?.id))
printHtmlPart(237)
}
printHtmlPart(238)
if(true && (formDetailInstance?.paymentInfoId?.status != "success")) {
printHtmlPart(110)
createClosureForHtmlPart(134, 4)
invokeTag('form','g',3424,['url':([resource:formDetailInstance, action:'delete']),'method':("DELETE")],4)
printHtmlPart(110)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(135, 4)
invokeTag('link','g',3426,['class':("btn btn blue btn-primary"),'action':("show"),'resource':(formDetailInstance)],4)
printHtmlPart(136)
}
printHtmlPart(305)
i++
}
}
printHtmlPart(306)
})
invokeTag('captureBody','sitemesh',3510,['class':("page-container-bg-solid")],1)
printHtmlPart(307)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1749523525219L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
