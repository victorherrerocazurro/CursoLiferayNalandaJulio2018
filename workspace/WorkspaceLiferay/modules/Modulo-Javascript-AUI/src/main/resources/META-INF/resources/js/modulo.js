AUI.add(
	'liferay-my-modulo',
	function(A) {
		var InvocarServicioUsuarios = function() {
			
			var resultado;
			
			Liferay.Service(
				{
					"$user[emailAddress,firstName,contactId] = /user/get-user-by-id": {
						"userId": Liferay.ThemeDisplay.getUserId(),
						"$contacto[emailAddress] = /contact/get-contact": {"@contactId": "$user.contactId"}
					}
				},
				function(obj) {console.log(obj);resultado = obj;}
			);
			return resultado;
		};
		
		Liferay.InvocarServicioUsuarios = InvocarServicioUsuarios;
	},
	'',
	{
		requires: ['aui-base']
	}
);