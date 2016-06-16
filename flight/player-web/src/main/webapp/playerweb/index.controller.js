sap.ui.controller("playerweb.index", {
	onInit : function(evt) {

		this.getView().addDelegate(
				{
					onBeforeShow : function(evt) {
						var oModel = new sap.ui.model.odata.ODataModel(
								"PlayerOData.svc/");
						evt.to.setModel(oModel);
					}
				});
	},

	onAdd : function(evt) {
		app.to("addplayer");
	},
	onDetailPress : function(event) {
		var bindingContext = event.getSource().getBindingContext();
		var playerid = bindingContext.getProperty("Id");
		var myObject = bindingContext.getObject();
		app.to("addplayer", "slide", bindingContext);

	}
});