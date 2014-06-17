<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<header>
    <div class="contain-to-grid sticky">
        <nav class="top-bar" data-topbar data-options="sticky_on: large">
            <ul class="title-area">
                <li class="name">
                    <h1>
                        <a href=""<spring:url value='' />">E-Commerce</a>
                    </h1>
                </li>
                <li class="toggle-topbar menu-icon"><a href="#"><span>Menu</span></a></li>
            </ul>
            <section class="top-bar-section">
                <ul class="right">
                    <li>
                        <a href="<spring:url value="clients" />">Clients</a>
                    </li>
                    <li>
                        <a href="<spring:url value="commandes" />">Commandes</a>
                    </li>
                </ul>
            </section>
        </nav>
    </div>
</header>