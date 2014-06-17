<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
        <link href="<c:url value="../../resources/css/foundation/normalize.css" />" rel="stylesheet">
        <link href="<c:url value="../../resources/css/foundation/foundation.min.css" />" rel="stylesheet">
        <link href="<c:url value="../../resources/css/main.css" />" rel="stylesheet">
        <tiles:insertAttribute name="css" />
    </head>
    <body>
        <tiles:insertAttribute name="header" />

        <div class="row">
            <div id="content" class="small-12 columns">
                <tiles:insertAttribute name="body" />
            </div>
        </div>

        <tiles:insertAttribute name="footer" />

        <script src="<c:url value="../../resources/js/foundation/vendor/jquery.js" />"></script>
        <script src="<c:url value="../../resources/js/foundation/vendor/modernizr.js" />"></script>
        <script src="<c:url value="../../resources/js/foundation/foundation.min.js" />"></script>
        <tiles:insertAttribute name="js" />
        <script src="<c:url value="../../resources/js/main.js" />"></script>
    </body>
</html>