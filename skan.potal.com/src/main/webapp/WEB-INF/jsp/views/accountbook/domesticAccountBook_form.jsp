<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/TagLib.jspf"%>

<script>
	var DomesticAccountBookAction = (function (){
		
		return {
			submit : function () {
				document.domesticAccountBook_form.action = "${pageContext.request.contextPath}/domestic_account_book/insert";
				document.domesticAccountBook_form.submit();
			},
			upperCode : function () {
				$('#upperCode').val($('#upperCodeData').val());
				$("#myModal").modal('hide');
			}
		}
	})();
	
	// 성공 실패 메시지...
	function callback() {
		setTimeout(function() {
	        $( "#message:visible" ).removeAttr( "style" ).fadeOut();
	      }, 5000 );
	}
	
	$(function() {
		if('${message}' == 'SUCCESS'){
			$('#message').fadeIn().delay(1200).fadeOut();
			//$('#message').show('blind', {
		    //   direction : 'up'
		    //}, 500, callback); 
		} else if('${message}' == 'FAIL') {
			$('#message').show();
		}
		
	});
	
	$(function() {
		var dateObject = {
			changeMonth: true, 
			changeYear: true,
			nextText: '다음 달',
			prevText: '이전 달',
			showButtonPanel: true, 
			currentText: '오늘 날짜', 
			closeText: '닫기', 
			dateFormat: "yy-mm-dd",
			dayNames: ['월요일', '화요일', '수요일', '목요일', '금요일', '토요일', '일요일'],
			dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
			monthNamesShort: ['1','2','3','4','5','6','7','8','9','10','11','12'],
			monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월']
		}
		
		$("#businessDay").datepicker(dateObject);
		
	});
	
	
</script>

<div class="alert alert-success" role="alert" id="message" style="display: none;">
	<c:if test=""></c:if>
	<c:choose>
		<c:when test="${message eq 'SUCCESS'}">성공하였습니다.</c:when>
		<c:otherwise>실패하였습니다.</c:otherwise>
	</c:choose>

</div>

<form name="domesticAccountBook_form" id="domesticAccountBook_form" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/domestic_account_book/insert" method="post">
<input type="hidden" id="dabMngNo" 		name="dabMngNo" 	 value="${domesticAccountBook.dabMngNo}">

	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">수입/지출 유형</label>
		<div class="col-sm-8">
			
			<label class="radio-inline">
				<input type="radio" id="typeCode" name="typeCode" placeholder="상위코드" value="00001" checked="checked" >수입
			</label>
			<label class="radio-inline">
				<input type="radio" id="typeCode" name="typeCode" placeholder="상위코드" value="00002" >지출
			</label>
						
			<div class="has-error">
				<label class="control-label" for="inputSuccess1"><form:errors path="domesticAccountBook.upperCode" /></label>
			</div>
		</div>
	</div>
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">세부 유형</label>
		<div class="col-sm-10">
			
			<div class="col-sm-5">
				<select class="form-control" id="detailTypeCode_First" name="detailTypeCode_First" size="7">
					<c:choose>
						<c:when test="">
							<c:forEach var="code" items="${cmtbCodes}" varStatus="status">
								<option value="${code.CmtbCodeId.code}">${code.codeName}</option>							
							
							</c:forEach>
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</select>
			</div>
			<div class="col-sm-5">
				<select class="form-control" id="detailTypeCode" name="detailTypeCode" size="7">
				
				
				
				</select>
			
			</div>
			
			<div class="has-error">
				<label class="control-label" for="inputSuccess1"><form:errors path="domesticAccountBook.detailTypeCode" /></label>
			</div>
		</div>
	</div>

	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">거래일</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="businessDay" name="businessDay" placeholder="yyyy-MM-dd" value="${domesticAccountBook.businessDay}" >
			
			<div class="has-error">
				<label class="control-label" for="inputSuccess1"><form:errors path="domesticAccountBook.businessDay" /></label>
			</div>
		</div>
	</div>

	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">금액</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="amount" name="amount" placeholder="금액" value="${domesticAccountBook.amount}" >
			
			<div class="has-error">
				<label class="control-label" for="inputSuccess1"><form:errors path="domesticAccountBook.amount" /></label>
			</div>
		</div>
	</div>
	
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">내역</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="breakdown" name="breakdown" placeholder="내역" value="${domesticAccountBook.breakdown}" >
			
			<div class="has-error">
				<label class="control-label" for="inputSuccess1"><form:errors path="domesticAccountBook.breakdown" /></label>
			</div>
		</div>
	</div>
	
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">세부내용</label>
		<div class="col-sm-10">
			<textarea rows="5" class="form-control" id="detailContents" name="detailContents" >${domesticAccountBook.detailContents}</textarea>
			<div class="has-error">
				<label class="control-label" for="inputSuccess1"><form:errors path="domesticAccountBook.detailContents" /></label>
			</div>
		</div>
	</div>

	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default" onclick="">저장</button>
			<button type="button" class="btn btn-danger" onclick="javascript:document.domesticAccountBook_form.reset();">취소</button>
		</div>
	</div>

</form>


<div class="modal fade" id="myModal" role="dialog"
	aria-labelledby="gridSystemModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="gridSystemModalLabel">상위코드 입력</h4>
			</div>
			<div class="modal-body">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<label for="recipient-name" class="control-label">상위코드:</label>
							<select class="form-control" id="upperCodeData">
							</select>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">취소</button>
				<button type="button" class="btn btn-primary" onclick="DomesticAccountBookAction.upperCode()">확인</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->


<script>
	$(document).ready(function() {
		$("#myBtn").click(function() {
			$("#myModal").modal();
			$.ajax({
				url : '${pageContext.request.contextPath}/code/code_list',
				dataType : 'json',
				accepts : {
					xml : 'text/xml',
					text : 'text/plain'
				}
			}).done(function(data) {
				$('#upperCodeData').find('option').remove();
				$(data).each(function (index, obj){
					$('#upperCodeData').append('<option value='+obj.domesticAccountBookId.code+'>' + obj.codeName +'</option>')
				})
			})
		});
	});
</script>
