 package com.health.healthplus.model;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="slots", schema="healthplus")
public class Slots {
	
	@Id
    @GeneratedValue
	@Column(name="slot_id")
	private int slot_id;
	
	@Column(name="slot_time")
	private LocalTime slot_time;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "slot_id")
	private List<SlotAvailability> slotAvailability;
	
	public int getSlot_id() {
		return slot_id;
	}
	public void setSlot_id(int slot_id) {
		this.slot_id = slot_id;
	}
	public LocalTime getSlot_time() {
		return slot_time;
	}
	public void setSlot_time(LocalTime slot_time) {
		this.slot_time = slot_time;
	}
	
	public List<SlotAvailability> getSlotAvailability() {
		return slotAvailability;
	}
	public void setSlotAvailability(List<SlotAvailability> slotAvailability) {
		this.slotAvailability = slotAvailability;
	}
	

}
