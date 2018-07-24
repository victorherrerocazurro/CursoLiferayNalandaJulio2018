        <%@include file="../init.jsp"%>
        
        <liferay-ui:success key="entryAdded" message="entry-added" />
        <liferay-ui:success key="guestbookAdded" message="guestbook-added" />
        <liferay-ui:success key="entryDeleted" message="entry-deleted" />
        

        <%
        long guestbookId = Long.valueOf((Long) renderRequest
                .getAttribute("guestbookId"));
        %>
        
        <liferay-portlet:renderURL varImpl="searchURL">
            <portlet:param name="mvcPath" 
            value="/guestbookwebportlet/view_search.jsp" />
        </liferay-portlet:renderURL>
        
        <aui:form action="<%= searchURL %>" method="get" name="fm">
            <liferay-portlet:renderURLParams varImpl="searchURL" />

            <div class="search-form">
                <span class="aui-search-bar">
                    <aui:input inlineField="<%= true %>" label="" 
                    name="keywords" size="30" title="search-entries" type="text"
                    />

                    <aui:button type="submit" value="search" />
                </span>
            </div>
        </aui:form>
        
        <aui:nav cssClass="nav-tabs">

	<%
		List<Guestbook> guestbooks = GuestbookLocalServiceUtil
					.getGuestbooks(scopeGroupId,WorkflowConstants.STATUS_APPROVED);
			for (int i = 0; i < guestbooks.size(); i++) {
				Guestbook curGuestbook = (Guestbook) guestbooks.get(i);
				String cssClass = StringPool.BLANK;
				if (curGuestbook.getGuestbookId() == guestbookId) {
					cssClass = "active";
				}
				if (GuestbookPermission.contains(
					permissionChecker, curGuestbook.getGuestbookId(), "VIEW")) {
										
	%>

	<portlet:renderURL var="viewPageURL">
		<portlet:param name="mvcPath" value="/guestbookwebportlet/view.jsp" />
		<portlet:param name="guestbookId"
			value="<%=String.valueOf(curGuestbook.getGuestbookId())%>" />
	</portlet:renderURL>

        
	<aui:nav-item cssClass="<%=cssClass%>" href="<%=viewPageURL%>"
		label="<%=HtmlUtil.escape(curGuestbook.getName())%>" />

	<%  
            	}
			
			}
	%>

</aui:nav>
        

        <aui:button-row cssClass="guestbook-buttons">
        <c:if test='<%= GuestbookPermission.contains(permissionChecker, guestbookId, "ADD_ENTRY") %>'>

            <portlet:renderURL var="addEntryURL">
                <portlet:param name="mvcPath" value="/guestbookwebportlet/edit_entry.jsp" />
                <portlet:param name="guestbookId"
                    value="<%=String.valueOf(guestbookId)%>" />
            </portlet:renderURL>
        
            <aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry"></aui:button>
        </c:if>
    
        </aui:button-row>

        <liferay-ui:search-container total="<%=EntryLocalServiceUtil.getEntriesCount(scopeGroupId.longValue(), 
                        guestbookId, WorkflowConstants.STATUS_APPROVED)%>">
        <liferay-ui:search-container-results
            results="<%=EntryLocalServiceUtil.getEntries(scopeGroupId.longValue(), guestbookId, 
                            WorkflowConstants.STATUS_APPROVED, 
                            searchContainer.getStart(), 
                            searchContainer.getEnd())%>" />

        <liferay-ui:search-container-row
            className="com.liferay.docs.guestbook.model.Entry" modelVar="entry">

            <liferay-ui:search-container-column-text property="message" />

            <liferay-ui:search-container-column-text property="name" />
            <liferay-ui:search-container-column-jsp path="/guestbookwebportlet/entry_actions.jsp" align="right" />
        

        </liferay-ui:search-container-row>

        <liferay-ui:search-iterator />
        
        </liferay-ui:search-container>

