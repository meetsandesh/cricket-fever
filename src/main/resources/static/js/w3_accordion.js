(function($) {
	$.fn.w3_accordion = function (options) {
		this.settings = $.extend({
			accordion_main_heading:"Accordion Main Heading",
			type:"Accordion Type",
			external_callback: {}
		}, options);
		var private_attributes={

		};
		var id_suffix = new Date().getTime();
		var attributes = this.settings;
		var rootElement = this;
		var accordion_main_heading_html=	'<button id="accordion_button_'+id_suffix+'" class="w3-padding-16 w3-theme w3-button w3-block w3-left-align accord-btn accordion_button">MAIN_HEADING</button>'+
								'<div id="DYNAMIC_ID" class="w3-hide">'+
									'ACCORDION_CONTENT'+
								'</div>';
		var _bindContent = function () {
			//Heading
			accordion_main_heading_html=accordion_main_heading_html.replace(/MAIN_HEADING/g,attributes.accordion_main_heading);
			accordion_main_heading_html=accordion_main_heading_html.replace(/DYNAMIC_ID/g,"accordion_div_"+id_suffix);
			rootElement.append(accordion_main_heading_html);
		};
		var _bindAction = function () {
			rootElement.find("#accordion_button_"+id_suffix).on("click",function(event){
				rootElement.find("#accordion_div_"+id_suffix).toggleClass("w3-show");
			});
		};
		this.appendContent = function (html) {
			rootElement.find("#accordion_div_"+id_suffix).append(html);
		};
		this.replaceContent = function (html) {
			rootElement.find("#accordion_div_"+id_suffix).html(html);
		};
		this.setExternalCallback = function (callback_json) {
			attributes.external_callback=callback_json;
		};
		this.initializeExternalCallback = function () {
			attributes.external_callback.callback(rootElement,attributes);
		};
		this.initializeAccordion = function (_init_func) {
			attributes.external_callback.initialize_callback(rootElement,attributes);
		};
		this.openAccordion = function () {
			rootElement.find("#accordion_button_"+id_suffix).click();
		};
		this.getData = function () {
			return attributes.external_callback.get_data(rootElement,attributes);
		};
		var _init = function () {
			_bindContent();
			_bindAction();
		};
		_init();
		return this;
	};
}(jQuery));


