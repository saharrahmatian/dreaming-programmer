<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
          "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type"
        content="text/html; charset=UTF-8" />
  <meta http-equiv="X-UA-Compatible"
        content="IE=9;chrome=1" />

  <title>Embedding a Vaadin Application in HTML Page</title>
  
  <!-- Set up the favicon from the Vaadin theme -->
  <link rel="shortcut icon" type="image/vnd.microsoft.icon"
        href="/loan2-core/VAADIN/themes/reindeer/favicon.ico" />
  <link rel="icon" type="image/vnd.microsoft.icon"
           href="/loan2-core/VAADIN/themes/reindeer/favicon.ico" /> 
</head>

<body>
  <!-- Loads the Vaadin widget set, etc. -->
  <script type="text/javascript"
          src="/loan2-core/VAADIN/vaadinBootstrap.js"></script>

  <!-- GWT requires an invisible history frame. It is   -->
  <!-- needed for page/fragment history in the browser. -->
  <iframe tabindex="-1" id="__gwt_historyFrame"
          style="position: absolute; width: 0; height: 0;
                 border: 0; overflow: hidden"
          src="javascript:false"></iframe>  

  <h1>Embedding a Vaadin UI</h1>
    
  <p>This is a static web page that contains an embedded Vaadin
     application. It's here:</p>

  <!-- So here comes the div element in which the Vaadin -->
  <!-- application is embedded.                          -->
  <div style="width: 300px; border: 2px solid green;"
       id="helloworld" class="v-app">

    <!-- Optional placeholder for the loading indicator -->
    <div class=" v-app-loading"></div>

    <!-- Alternative fallback text -->
    <noscript>You have to enable javascript in your browser to
              use an application built with Vaadin.</noscript>
  </div>
  
  <script type="text/javascript">//<![CDATA[
    if (!window.vaadin)
        alert("Failed to load the bootstrap JavaScript: "+
              "/loan2-core/VAADIN/vaadinBootstrap.js");

    /* The UI Configuration */
	vaadin.initApplication("configuration", {
	    "browserDetailsUrl": "configuration/",
	    "serviceUrl": "configuration/",
	    "widgetset": "com.vaadin.DefaultWidgetSet",
	    "theme": "reindeer",
	    "versionInfo": {"vaadinVersion": "7.0.0"},
	    "vaadinDir": "VAADIN/",
	    "heartbeatInterval": 300,
	    "debug": true,
	    "standalone": false,
	    "authErrMsg": {
	        "message": "Take note of any unsaved data, "+
	                   "and <u>click here<\/u> to continue.",
	        "caption": "Authentication problem"
	    },
	    "comErrMsg": {
	        "message": "Take note of any unsaved data, "+
	                   "and <u>click here<\/u> to continue.",
	        "caption": "Communication problem"
	    },
	    "sessExpMsg": {
	        "message": "Take note of any unsaved data, "+
	                   "and <u>click here<\/u> to continue.",
	        "caption": "Session Expired"
	    }
	});//]] >
  </script>
  

  <p>Please view the page source to see how embedding works.</p>
</body>
</html>