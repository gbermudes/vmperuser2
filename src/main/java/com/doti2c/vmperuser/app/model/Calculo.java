package com.doti2c.vmperuser.app.model;

public class Calculo {
	int proc;
	int mem;
	int disc;
	int band;
	int soft;
	int total;
		
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getSoft() {
		return soft;
	}
	public void setSoft(int soft) {
		this.soft = soft;
	}
	/**
	 * @param proc
	 * @param mem
	 * @param disc
	 * @param band
	 */
	public Calculo(int proc, int mem, int disc, int band, int soft) {
		super();
		this.proc = proc;
		this.mem = mem;
		this.disc = disc;
		this.band = band;
		this.soft = soft;
		
		
	}
	public int getProc() {
		return proc;
	}
	public void setProc(int proc) {
		this.proc = proc;
	}
	public int getMem() {
		return mem;
	}
	public void setMem(int mem) {
		this.mem = mem;
	}
	public int getDisc() {
		return disc;
	}
	public void setDisc(int disc) {
		this.disc = disc;
	}
	public int getBand() {
		return band;
	}
	public void setBand(int band) {
		this.band = band;
	}
	

}
