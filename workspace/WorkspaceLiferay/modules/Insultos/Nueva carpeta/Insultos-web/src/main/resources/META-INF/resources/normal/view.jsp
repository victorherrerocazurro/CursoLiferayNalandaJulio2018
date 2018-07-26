<%@ include file="../init.jsp"%>

<aui:form method="get" name="fm">
	<div class="search-form">
		<span class="aui-search-bar"> 
			<aui:input id="texto" inlineField="<%=true%>" label="" name="keywords" size="30"
				title="search-entries" type="text" /> 
			<aui:input type="button" value="search" />
		</span>
	</div>
</aui:form>

<div id="myDataTable"></div>

<aui:script use="aui-datatable, aui-node">
AUI().use(
  'aui-datatable', 'aui-node',
  function(Y) {
    

    Liferay.Service(
   		'/insulto/buscar-por-texto',
   		{
   			texto: Y.one('#<portlet:namespace/>texto')
   		},
   		function(obj) {
   			
   			var columns = ['texto'];
   			
   			new Y.DataTable.Base(
   			      {
   			        columnset: columns,
   			        recordset: obj
   			      }
   			).render('#myDataTable');
   		}
	);

    
  }
);

</aui:script>