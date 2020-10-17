<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 16.10.2020
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/header.jsp" %>


<div class="container-fluid">


    <h1 class="h3 mb-0 text-gray-800">UsersCRUD</h1>

    <a href="<c:url value="/user/Add"/>" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">

        <i class="fas fa-download fa-sm text-white-50"></i> Dodaj użytkownika</a>

</div>

<div class="card shadow mb-4">

    <div class="card-header py-3">

        <h6 class="m-0 font-weight-bold text-primary">Lista użytkowników</h6>

    </div>

    <div class="card-body">

        <div class="table-responsive">

            <table class="table">

                <tr>

                    <th>Id</th>

                    <th>Nazwa użytkownika</th>

                    <th>Email</th>

                    <th>Akcja</th>

                </tr>

                <c:forEach items="${users}" var="user">

                    <tr>

                        <td>${user.id}</td>

                        <td>${user.userName}</td>

                        <td>${user.email}</td>

                        <td>

                            <a href='<c:url value="/user/delete?id=${user.id}"/>'>Usuń</a>

                            <a href='<c:url value="/user/edit?id=${user.id}"/>'>Edit</a>

                            <a href='<c:url value="/user/show?id=${user.id}"/>'>Pokaż</a>

                        </td>

                    </tr>

                </c:forEach>

            </table>

        </div>

    </div>

</div>

</div>
<!-- Card Body -->
</div>
</div>


<!-- Content Row -->
<div class="row">
    <%@ include file="/footer.jsp" %>
