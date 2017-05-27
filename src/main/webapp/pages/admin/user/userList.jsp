<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../../common/layout.jsp"%>
<div class="content-wrapper">
	<section class="content-header">
	<h1>客户管理</h1>
	</section>
	<section class="content">
	<div class="row">
		<div class="col-md-12">
			<div class="box">
				<div class="box-header">
					<h3 class="box-title">客户列表</h3>
					<a class="btn btn-block btn-primary">新增</a>
				</div>
				<!-- /.box-header -->
				<div class="box-body">
					<div class="dataTables_wrapper form-inline dt-bootstrap">
						<div class="row">
							<div class="col-sm-12">
								<table id="user_list" class="table table-bordered table-hover dataTable">
									<thead>
										<tr>
											<th>编号</th>
											<th>姓名</th>
											<th>手机号</th>
											<th>地址</th>
											<th>身份证</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="item" items="${entitys}">
											<tr>
												<td>${item.id}</td>
												<td>${item.name}</td>
												<td>${item.mobile}</td>
												<td>${item.address}</td>
												<td>${item.idcard}</td>
											</tr>	
										</c:forEach>
									</tbody>
								</table>
								<%@ include file="/pages/common/pagination.jsp"%>
							</div>
						</div>
						
					</div>
				</div>
				<!-- /.box-body -->
			</div>
		</div>
	</div>
	</section>
</div>

</html>