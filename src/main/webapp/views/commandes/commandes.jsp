<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<tiles:insertDefinition name="base.definition">
    <tiles:putAttribute name="title">E-Commerce | Commandes</tiles:putAttribute>
    <tiles:putAttribute name="body">
        <h3>Liste des Commandes</h3>
        <br/>
        <table width="100%">
            <thead>
                <th>Référence</th>
                <th>Client</th>
                <th>Date</th>
                <th>Total TTC</th>
                <th>Statut du Paiement</th>
                <th>Statut de la Livraison</th>
            </thead>
            <tbody>
                <c:forEach var="commande" items="${commandes}">
                    <tr>
                        <td>${commande.reference}</td>
                        <td>${commande.client.nomComplet}</td>
                        <fmt:formatDate value="${commande.date}" var="dateCommande" pattern="dd/MM/yyyy à HH:mm" />
                        <td>${dateCommande}</td>
                        <fmt:formatNumber value="${commande.prixTotal}" var="prixCommande" type="currency" currencySymbol="€" groupingUsed="false" />
                        <td>${prixCommande}</td>
                        <td>
                            <select>
                                <c:forEach var="commandeStatutPaiement" items="${commande.commandeStatutPaiements}">
                                    <option>
                                        <fmt:formatDate value="${commandeStatutPaiement.date}" var="dateStatut" pattern="dd/MM/yyyy à HH:mm" />
                                        ${dateStatut} ${commandeStatutPaiement.statutPaiement.libelle}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                        <td>
                            <select>
                                <c:forEach var="commandeStatutCommande" items="${commande.commandeStatutCommandes}">
                                    <option>
                                        <fmt:formatDate value="${commandeStatutCommande.date}" var="dateStatut" pattern="dd/MM/yyyy à HH:mm" />
                                            ${dateStatut} ${commandeStatutCommande.statutCommande.libelle}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </tiles:putAttribute>
</tiles:insertDefinition>