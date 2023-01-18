package pro.wings.exception;

import java.util.List;

public class ErrorResponse {
String messgae;
List<String>details;
public ErrorResponse(String messgae, List<String> details) {
	super();
	this.messgae = messgae;
	this.details = details;
}
public String getMessgae() {
	return messgae;
}
public void setMessgae(String messgae) {
	this.messgae = messgae;
}
public List<String> getDetails() {
	return details;
}
public void setDetails(List<String> details) {
	this.details = details;
}


}
