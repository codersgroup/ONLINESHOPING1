<div class="container">
	<div class="row">

		<div class="col-lg-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>
		<div class="col-md-9">

			<div class="row">

				<div class="col-lg-12">
					<c:if test="${userClickAllProduct==true}">
						<ol class="breadcrumb">

							<li><a href="${context}/home">Home</a></li>
							<li class="active">All Products</li>

						</ol>
					</c:if>
					
					<c:if test="${userClickIdProduct==true}">
						<ol class="breadcrumb">

							<li><a href="${context}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${catagory.name}</li>

						</ol>
					</c:if>
				</div>

			</div>


		</div>

	</div>

</div>