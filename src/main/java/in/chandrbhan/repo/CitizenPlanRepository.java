package in.chandrbhan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.chandrbhan.entity.CitizenPlan;

public interface CitizenPlanRepository 
			extends JpaRepository<CitizenPlan, Integer> {
	
	// custome query to get plan name
	@Query("select distinct (planName) from CitizenPlan")
	public List<String> getPlanNames();
	// custome query to get plan status
	@Query("select distinct (planStatus) from CitizenPlan")
	public List<String> getPlanStatus();
}
