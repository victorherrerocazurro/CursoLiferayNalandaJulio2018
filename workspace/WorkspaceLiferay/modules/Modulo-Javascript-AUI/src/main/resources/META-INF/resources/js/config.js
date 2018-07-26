;(function() {
	AUI().applyConfig(
		{
			groups: {
				mymodulo: {
					base: MODULE_PATH + '/js/',
					combine: Liferay.AUI.getCombine(),
					modules: {
						'liferay-my-modulo': {
							path: 'modulo.js',
							requires: [
								'aui-base'
							]
						}
					},
					root: MODULE_PATH + '/js/'
				}
			}
		}
	);
})();