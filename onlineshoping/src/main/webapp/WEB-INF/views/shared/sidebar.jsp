

<!-- <h1 class="my-4">Shop Name</h1> -->

<div class="list-group">

	<c:forEach items="${CatagoryList}" var="catagory">

		<a href="${context}/show/catagoies/${catagory.id}/product"
			class="list-group-item" id="a_${catagory.name}">${catagory.name}</a>


	</c:forEach>
</div>