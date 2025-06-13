<%@ page import="com.hiideals.jobForm.FormDetail"%>

<input type="hidden" name="formId" value="${formdt?.id }">
<div class="form-body">
	<h1 class="form-section caption-subject font-red bold"
		style="TEXT-ALIGN: center !important;">Application For Assistant Professor on Contract Basis</h1>
	<span style="color: red; font-weight: bold; margin-left: 280px;"></span>
	<div class="row">
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-6">Application Number : <span
					style="color: red; font-weight: bold"> ${formdt?.apllicationNo}
				</span></label>

			</div>
		</div>
	</div>

	<h3 class="form-section caption-subject font-blue bold uppercase"
		style="TEXT-ALIGN: center !important;">Upload Documents</h3>

	<div class="row">
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload Picture<span
					style="color: red">*</span></label>
				<div class="col-md-9">
					<input type="file" name="picture" placeholder="Input Value"
						id="file" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
						class="form-control" required/>
					<div id="alert"></div>
					<div id="picture1" style="display: none; color: red;">Please
						Choose File</div>


				</div>
			</div>
		</div>
		<!--/span-->
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload Signature<span
					style="color: red">*</span></label>
				<div class="col-md-9">
					<input type="file" name="signature" placeholder="Input Value"
						id="files1" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
						class="form-control" required/>
					<div id="alert1"></div>
					<div id="signature1" style="display: none; color: red;">
						Please Choose File</div>
				</div>
			</div>
		</div>
	</div>



	<div class="row">
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload SSLC(X) Marks
					Sheet<span style="color: red">*</span>
				</label>
				<div class="col-md-9">
					<input type="file" name="sslcMarksSheet" placeholder="Input Value"
						id="files2" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
						class="form-control" required/>
					<div id="alert23"></div>
					<div id="sslcMarksSheet1" style="display: none; color: red;">
						Please Choose File</div>


				</div>
			</div>
		</div>
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload PUC(XII) Marks
					Sheet<span style="color: red">*</span>
				</label>
				<div class="col-md-9">
					<input type="file" name="pucMarksSheet" placeholder="Input Value"
						id="files3" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
						class="form-control" required/>
					<div id="alert3"></div>
					<div id="pucMarksSheet1" style="display: none; color: red;">
						Please Choose File</div>
				</div>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload Bachelor's
					Final Year Marks Sheet / Transcript<span style="color: red">*</span>
				</label>
				<div class="col-md-9">
					<input type="file" name="bachelorsMarksSheet"
						placeholder="Input Value" class="form-control" id="files4"
						data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png" required/>
					<div id="alert4"></div>
					<div id="bachelorsMarksSheet1" style="display: none; color: red;">
						Please Choose File</div>


				</div>
			</div>
		</div>
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload Bachelor's
					Provisional Degree Certificate<span style="color: red">*</span>
				</label>
				<div class="col-md-9">
					<input type="file" name="ugPDC" placeholder="Input Value"
						class="form-control" id="files45"
						data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png" required/>
					<div id="alert45"></div>
					<div id="ugPDC" style="display: none; color: red;">Please
						Choose File</div>


				</div>
			</div>
		</div>
	</div>


	<div class="row">
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload Master's Final
					Year Marks Sheet / Transcript<span style="color: red">*</span>
				</label>
				<div class="col-md-9">
					<input type="file" name="masterMarksSheet"
						placeholder="Input Value" id="files5"
						data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
						class="form-control" required/>
					<div id="alert5"></div>
					<div id="masterMarksSheet1" style="display: none; color: red;">
						Please Choose File</div>
				</div>
			</div>
		</div>
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload Master's
					Provisional Degree Certificate<span style="color: red">*</span>
				</label>
				<div class="col-md-9">
					<input type="file" name="pgPDC" placeholder="Input Value"
						id="files55" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
						class="form-control" required/>
					<div id="alert55"></div>
					<div id="pgmPDC" style="display: none; color: red;">Please
						Choose File</div>
				</div>
			</div>
		</div>
	</div>

	<div class="row">
		<g:if test="${formdt?.neteducation != "Yes"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload PhD MarkSheet
						/ Transcript<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="phDCertificate" placeholder="Input Value" id="filesn111"
							 data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							class="form-control"  />
						<div id=alertn111></div>
					</div>
				</div>
			</div>
		</g:if>
		<g:else>
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload PhD Marks
						Sheet / Transcript</label>
					<div class="col-md-9">
						<input type="file" name="phDCertificate" placeholder="Input Value"  id="filesn111"
							id="files667" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							class="form-control"  />
							<div id="alertn111"></div>
					</div>
				</div>
			</div>
		</g:else>



		<g:if test="${formdt?.neteducation != "Yes"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload PhD
						Provisional Degree Certificate<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="phdPDc" placeholder="Input Value"
						id="filesn222" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							class="form-control"  />
						<div id="alertn222"></div>

					</div>
				</div>
			</div>
		</g:if>

		<g:else>
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload PhD
						Provisional Degree Certificate</label>
					<div class="col-md-9">
						<input type="file" name="phdPDc" placeholder="Input Value"
							id="filesn222" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							class="form-control" />
							<div id="alertn222"></div>
					</div>
				</div>
			</div>
		</g:else>
	</div>



	<div class="row">
		<g:if test="${formdt?.socialcategory != "GM"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload Caste Income
						Certificate<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="casteIncomeCertificate" id="filesn6"
							data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							placeholder="Input Value" class="form-control"  />
						<div id="alertn6"></div>

					</div>
				</div>
			</div>
		</g:if>


		<g:if test="${formdt?.ruralstdy == "Yes"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload Rural
						Certificate<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="ruralCertificate" id="filesn7"
							placeholder="Input Value"
							data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							class="form-control"  />
						<div id="alertn7"></div>
					</div>
				</div>
			</div>
		</g:if>

	</div>


	<div class="row">
		<g:if test="${formdt?.exServiceMan == "Yes"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload Ex-Servicemen
						Certificate<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="exServicemenCertificate" id="filesn8"
							data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							placeholder="Input Value" class="form-control"  />
						<div id="alertn8"></div>
					</div>

				</div>
			</div>
		</g:if>


		<g:if test="${formdt?.kannadaMedium == "Yes"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload Kannada Medium
						Certificate<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="kannadaMediumCertificate" id="filesn9"
							data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							placeholder="Input Value" class="form-control"  />
						<div id="alertn9"></div>
					</div>
				</div>
			</div>
		</g:if>

	</div>

	<div class="row">
		<g:if test="${formdt?.j371 == "Yes"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload
						Kalyana-Karnataka (371J) Certificate<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="kalyanaKarnatakaCertificate" id="filesn10"
							data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							placeholder="Input Value" class="form-control"  />
						<div id="alertn10"></div>
						<p style="color: red;">
							<b>Note:</b>Only Annexure-A with RD-No.
						</p>

					</div>
				</div>
			</div>
		</g:if>

		<g:if test="${formdt?.kpsckannadaexam == "Yes"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload Kannada
						Language Certificate<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="kpsckannadaCertificate" id="filesn11"
							data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							placeholder="Input Value" class="form-control"  />
						<div id="alertn11"></div>


					</div>
				</div>
			</div>
		</g:if>

	</div>

<div class="row">

 <g:if test="${formdt?.ageRelax == "Yes"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload Age Relaxation
					Category Certificate Physically Handicap / In-Service<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="ageRelax1"   id="filesn12"
							data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							placeholder="Input Value" class="form-control"  />
                      <div id="alertn12"></div>
					</div>
				</div>
			</div>
		</g:if>
</div>


	<div class="row" >
   <g:if test="${formdt?.kvcNo}">
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload KVC Certificate
					front page<span style="color: red">*</span>
				</label>
				<div class="col-md-9">
					<input type="file" name="kVCCertificate" placeholder="Input Value" 
						id="filesn13" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
						class="form-control" />
					<div id="alertn13"></div>
				
					<p style="color: red;">
						<b>Note:</b>KVC validity entered in personal details should match
						with uploaded document otherwise application shall be rejected.
					</p>


				</div>
			</div>
		</div>


		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-3">Upload KVC Certificate
					back page<span style="color: red">*</span>
				</label>
				<div class="col-md-9">
					<input type="file" name="kvc2" placeholder="Input Value"
						id="filesn14" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
						class="form-control" />
					<div id="alertn14"></div>
					<p style="color: red;">
						<b>Note:</b>KVC validity entered in personal details should match
						with uploaded document otherwise application shall be rejected.
					</p>

				</div>
			</div>
		</div>
	</g:if>
	</div>

	<div class="row">
		<g:each in="${formdt?.experiences1?}" var="loc31" status="l">
			<g:if
				test="${loc31?.workExperience || loc31?.companyName || loc31?.postHeld || loc31?.nameOfTheEmployeer || loc31?.dateOfJoining || loc31?.dateOfLeaving || loc31?.periodOfService || loc31?.reasonOfLeaving || loc31?.basicPay != null}">

				<div class="col-md-6">
					<div class="form-group">
						<label class="control-label col-md-3">Upload Experience
							Certificate<span style="color: red">*</span>
						</label>
						<div class="col-md-9">
							<input type="file" name="experienceCertificate" id="files155"
								data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png" 
								placeholder="Input Value" class="form-control" />
							<div id="alert155e"></div>
						</div>
					</div>
				</div>
			</g:if>

		</g:each>
		<g:if test="${formdt?.neteducation == "Yes"}">
			<div class="col-md-6">

				<div class="form-group">
					<label class="control-label col-md-3">Upload NET
						Certificate<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="nETCertificate" placeholder="Input Value"
						id="filesn15" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png" 
							class="form-control" />
						<div id="alertn15"></div>
						<p style="color: red;">
							<b>Note:</b>candidates having NET certificate in DigiLocker shall
							download the same from DigiLocker and upload here.
						</p>
					</div>
				</div>
			</div>

		</g:if>

	</div>



	<div class="row">
		<g:if test="${formdt?.pwd == "Yes"}">
			<div class="col-md-6">
				<div class="form-group">
					<label class="control-label col-md-3">Upload Person with
						Disability (PWD) Certificate<span style="color: red">*</span>
					</label>
					<div class="col-md-9">
						<input type="file" name="personwithDisabilityCertificate"
							id="filesn16" data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png"
							 placeholder="Input Value" class="form-control" />
						<div id="alertn16"></div>
					</div>
				</div>
			</div>
		</g:if>

	</div>


	<div class="row">
		<div class="col-md-12">
			<div class="form-group">
				<label class="control-label col-md-9"> <b style="color: red">Note:</b>Applicants
					who wish to submit any additional claims may kindly attach relevant
					documents with all the supporting files in this folder "ZIP FILE"
					and the size of the file should not exceed 100MB.
				</label>
				<div class="col-md-3">
					<input type="file" name="uploade10" placeholder="Input Value"
						id="files110"
						data-file_types="pdf|doc|docx|rtf|odt|jpg|jpeg|png|zip"
						class="form-control" />
					<div id="alert110"></div>
				</div>
			</div>
		</div>

	<div class="row">
			<div class="col-md-12">
				<div class="form-group">
					<p class="control-label col-md-4"
						style="margin-left: -280px; color: red; font-size: 16px;">
						<b>Note:</b>
					</p>
					<br>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="control-label col-md-9"
							style="color: red; font-size: 16px;">Please verify all the
							details before submitting.</p>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<label class="control-label col-md-9"
								style="margin-left: -100px; color: red; font-size: 16px;">
								After submitting there is No Update/ Edit option.</label>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>