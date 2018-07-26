
<%@page import="com.curso.insultos.service.InsultoLocalServiceUtil"%>
<%@page import="com.curso.insultos.model.Insulto"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@include file="init.jsp"%>

<%
	long insultoId = ParamUtil.getLong(request, "insultoId");

	Insulto insulto = null;

	if (insultoId > 0) {
		insulto = InsultoLocalServiceUtil.getInsulto(insultoId);
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp" />
</portlet:renderURL>

<portlet:actionURL
	name='<%=insulto == null ? "insultos/add" : "insultos/update"%>'
	var="editInsultoURL" />

<aui:form action="<%=editInsultoURL%>" name="fm">

	<aui:model-context bean="<%=insulto%>" model="<%=Insulto.class%>" />

	<aui:input type="hidden" name="guestbookId"
		value='<%=insulto == null ? "" : insulto.getInsultoId()%>' />

	<aui:fieldset>
		<aui:input name="texto" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" />
		<aui:button onClick="<%= viewURL %>" type="cancel" />
	</aui:button-row>

</aui:form>