package in.chandrbhan.service;

import java.util.List;

import in.chandrbhan.entity.CitizenPlan;
import in.chandrbhan.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
	

}
