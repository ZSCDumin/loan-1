<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../../common/layout.jsp"%>
<div class="content-wrapper">
	<section class="content-header">
		<h1>新增客户</h1>
	</section>
	<section class="content">
		<div class="row">
			<div class="col-md-6">
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">
							填写客户信息
						</h3>
					</div>
					<form id="form" method="post" action="/admin/user/up.do">
						<div class="box-body">
							<div class="form-group">
								<label>姓名</label>
								<input type="text" name="name" label="姓名" validate="required" class="form-control"/>
								<span class="help-block"></span>
							</div>
							<div class="form-group">
								<label>手机号</label>
								<input type="text" name="mobile" label="手机号" validate="required,mobile" class="form-control"/>
								<span class="help-block"></span>
							</div>
						</div>
						<div class="box-footer">
							<button type="button" class="btn btn-primary">提交</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
</div>
<script>
	jQuery(function(){
		CODES.form({
			id:"form",
			btn:"btn-primary",
			url:"/admin/user/up.do"
		});
	});
</script>
</html>