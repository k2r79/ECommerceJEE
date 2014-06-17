<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<tiles:insertDefinition name="base.definition">
    <tiles:putAttribute name="title">E-Commerce | Clients</tiles:putAttribute>
    <tiles:putAttribute name="body">
        <h3>Liste des clients</h3>
        <br/>
        <table width="100%">
            <thead>
                <th>Nom Complet</th>
                <th>Email</th>
                <th></th>
            </thead>
            <tbody>
                <c:forEach var="client" items="${clients}">
                    <tr>
                        <td>${client.nomComplet}</td>
                        <td>${client.email}</td>
                        <td>
                            <a href=""></a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </tiles:putAttribute>
</tiles:insertDefinition>