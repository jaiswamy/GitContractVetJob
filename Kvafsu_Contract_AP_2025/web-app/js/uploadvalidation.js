
	/*------------------------------Doc10------------------------------*/
		var title = $( "#files110" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files110').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 100; //100MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert110').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert110').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert110').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert110').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		


	
		

/*------------------------------Upload Picture------------------------------*/
	
    var title = $( "#file" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#file').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

		
		
		

		/*------------------------------Upload Signature------------------------------*/
	
   var title = $( "#files1" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files1').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert1').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert1').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert1').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert1').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

	
		
		
		
		
/*------------------------------Upload SSLC(X) Marks Sheet------------------------------*/
	
   var title = $( "#files2" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files2').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert23').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert23').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert23').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert23').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		/*------------------------------Upload PUC(XII) Marks Sheet------------------------------*/
	
   var title = $( "#files3" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files3').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert3').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert3').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert3').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert3').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		/*------------------------------Upload Bachelor's Final Year Marks Shee------------------------------*/
	
   var title = $( "#files4" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files4').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert4').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert4').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert4').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert4').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		
		/*------------------------------Upload Bachelor's provisional certificate------------------------------*/
	
   var title = $( "#files45" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files45').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert45').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert45').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert45').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert45').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		/*------------------------------Upload Master's Final Year Marks Sheet------------------------------*/
	
   var title = $( "#files5" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files5').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert5').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert5').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert5').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert5').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

			
		
		/*------------------------------Upload Master's Provisional degree certificate------------------------------*/
	
   var title = $( "#files55" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#files55').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alert55').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alert55').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alert55').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alert55').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

			
		
/*------------------------------Upload Caste Income certificate------------------------------*/
	
   var title = $( "#filesn6" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn6').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn6').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn6').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn6').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn6').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})


		
/*------------------------------Upload Rural Certificate------------------------------*/
	
   var title = $( "#filesn7" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn7').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn7').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn7').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn7').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn7').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})


			
/*------------------------------Upload Ex-servicemen Certificate------------------------------*/
	
   var title = $( "#filesn8" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn8').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn8').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn8').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn8').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn8').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})


		
	
			
/*------------------------------Upload Kannada medium Certificate------------------------------*/
	
   var title = $( "#filesn9" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn9').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn9').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn9').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn9').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn9').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

		
		
/*------------------------------Upload Kalyana Karnataka Certificate------------------------------*/
	
   var title = $( "#filesn10" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn10').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn10').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn10').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn10').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn10').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})

		
		
		
		
/*------------------------------Upload Kannada Language Certificate------------------------------*/
	
   var title = $( "#filesn11" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn11').on('change', function() {
		 var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn11').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn11').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn11').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn11').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		
		
/*------------------------------Upload Age Relaxation Certificate------------------------------*/
	
   var title = $( "#filesn12" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn12').on('change', function() {
		var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn12').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn12').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn12').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn12').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		
/*------------------------------Upload KVC Front Certificate------------------------------*/
	
   var title = $( "#filesn13" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn13').on('change', function() {
		var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn13').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn13').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn13').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn13').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
/*------------------------------Upload KVC Back Certificate------------------------------*/
	
   var title = $( "#filesn14" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn14').on('change', function() {
		var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn14').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn14').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn14').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn14').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
				
		
		
/*------------------------------Upload NET Certificate------------------------------*/
	
   var title = $( "#filesn15" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn15').on('change', function() {
		var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn15').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn15').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn15').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn15').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
				
		
		
/*------------------------------Upload PWD Certificate------------------------------*/
	
   var title = $( "#filesn16" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn16').on('change', function() {
		var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn16').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn16').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn16').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn16').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
		
		
		
/*------------------------------Upload PhD MarkSheet / Transcript------------------------------*/
	
   var title = $( "#filesn111" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn111').on('change', function() {
		var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn111').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn111').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn111').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn111').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})
				
				
		
		
		
/*------------------------------Upload PhD Provisional Degree Certificate------------------------------*/
	
   var title = $( "#filesn222" ).attr( "data-file_types" ).replace(/\|/g,', ');
	$( "#allowed-files" ).text( title );
	
	$('#filesn222').on('change', function() {
		var numb = $(this)[0].files[0].size/1024/1024; //count file size
		var resultid = $(this).val().split(".");
		var gettypeup  = resultid [resultid.length-1]; // take file type uploaded file
		var filetype = $(this).attr('data-file_types'); // take allowed files from input
		var allowedfiles = filetype.replace(/\|/g,', '); // string allowed file
		var filesize = 0.5; //2MB
		var onlist = $(this).attr('data-file_types').indexOf(gettypeup) > -1;
		var checkinputfile = $(this).attr('type');
		numb = numb.toFixed(2);

		if (onlist && numb <= filesize) {
					$('#alertn222').html('The file is uploaded').removeAttr('class').addClass('xd2'); //file OK
		   } else {
		   if(numb >= filesize && onlist){
		  $(this).val(''); //remove uploaded file
		      $('#alertn222').html('Added file is too big \(' + numb + ' MB\) - max file size '+ filesize +' MB').removeAttr('class').addClass('xd'); //alert that file is too big, but type file is ok
		      } else if(numb < filesize && !onlist) {
		     $(this).val(''); //remove uploaded file
		      $('#alertn222').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      } else if(!onlist) {
		    $(this).val(''); //remove uploaded file
		      $('#alertn222').html('An not allowed file format has been added \('+ gettypeup +') - allowed formats: ' + allowedfiles).removeAttr('class').addClass('xd'); //wrong type file
		      }
		   }
		})