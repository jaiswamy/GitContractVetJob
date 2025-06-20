

<div class="margin-bottom-20"></div>
<g:form controller="usercreate" enctype="multipart/form-data"
	name="validateip" class="horizontal-form">
	<div class="form-body">




		<div class="row">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: usersInstance, field: 'username', 'error')} ">
					<label for="username"> <g:message
							code="user.username.label" default="Username" />

					</label>
					<g:if test="${params?.action !="adminEdit"}">
						<g:textField name="username"
							class="form-control spinner input-circle"
							value="${usersInstance?.username}" required="true" />
					</g:if>
					<g:else>
						<input name="username" class="form-control spinner input-circle"
							value="${usersInstance?.username}" />
					</g:else>
				</div>
			</div>

			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: usersInstance, field: 'password', 'error')} ">
					<label for="password"> <g:message
							code="user.password.label" default="Password" />

					</label>
					<g:if test="${params?.action !="adminEdit"}">
						<g:textField name="password"
							class="form-control spinner input-circle"
							value="${usersInstance?.password}" required="true" />
					</g:if>
					<g:else>
						<input name="password" class="form-control spinner input-circle"
							value="${usersInstance?.password}" />
					</g:else>
				</div>
			</div>

			<%--<div class="col-md-3">
<div class="fieldcontain ${hasErrors(bean: usersInstance, field: 'uniqueNo', 'error')} ">
	<label for="uniqueNo">
		<g:message code="user.uniqueNo.label" default="Unique No" />
		
	</label>
	<g:textField name="uniqueNo" class="form-control" value="${usersInstance?.uniqueNo ? usersInstance?.uniqueNo : uniqueNo }"/>

</div>
</div>
--%>
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: usersInstance, field: 'pinCode', 'error')} ">
					<label for="phoneNo"> <g:message code="user.phoneNo.label"
							default="Phone No" />

					</label>
					<g:textField name="phoneNo"
						class="form-control spinner input-circle"
						value="${usersInstance?.phoneNo}" required="true" />

				</div>
			</div>
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: usersInstance, field: 'pinCode', 'error')} ">
					<label for="address"> Pincode </label>
					<g:textField name="pinCode"
						class="form-control spinner input-circle"
						value="${usersInstance?.address?.pinCode}" />

				</div>
			</div>

		</div>

		<div class="row">
			<div class="col-md-3">
				<label>House Number</label>
				<g:textField name="hsno" value="${usersInstance?.address?.hsno}"
					class="form-control spinner input-circle" />
			</div>
			<div class="col-md-3">
				<label>Street</label>
				<g:textField name="street" value="${usersInstance?.address?.street}"
					class="form-control spinner input-circle" />
			</div>
			<div class="col-md-3">
				<label>City</label>
				<g:textField name="city" value="${usersInstance?.address?.city}"
					class="form-control spinner input-circle" />
			</div>
			<div class="col-md-3">
				<label>State</label>
				<g:textField name="state" value="${usersInstance?.address?.state}"
					class="form-control spinner input-circle" />
			</div>
		</div>


		<g:if test="${params?.action !="userEdit"}">
			<div class="row">
				<div class="col-md-3">
					<label>Country</label>
					<g:textField name="country"
						class="form-control spinner input-circle" />
				</div>
				<div class="col-md-3">
					<label>Upload Image</label> <input type="file"
						class="form-control spinner input-circle" name="file_1" value="">
				</div>
			</div>
			<br>
			<g:actionSubmit action="saveUser" class="btn btn-primary"
				value="Save Details"></g:actionSubmit>
		</g:if>
		<g:else>
			<br>
			<g:hiddenField name="userListid" value="${usersInstance?.id}" />
			<g:actionSubmit action="updateUser" class="btn btn-primary"
				value="Update Details"></g:actionSubmit>
		</g:else>
	</div>

</g:form>



