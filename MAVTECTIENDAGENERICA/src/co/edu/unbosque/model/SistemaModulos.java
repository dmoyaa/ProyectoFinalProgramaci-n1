package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.ArchivosBinarios;
import co.edu.unbosque.model.Modulo1DAO;
import co.edu.unbosque.model.Modulo1DTO;

public class SistemaModulos {

	private Modulo1DTO modulo1dto;
	private Modulo1DAO modulo1dao;
	private GestionVentasDTO ventasdto;
	private GestionVentasDAO ventasdao;
	private ArchivosBinarios ab;
	private DetallesVentaDTO detallesdto;
	private DetallesVentaDAO detallesdao;
	private GestionDeClientesDAO gClientesDAO;
	private GestionDeClientesDTO gClientesDTO;
	private GestionDeProductosDAO gProductosDAO;
	private GestionDeProductosDTO gProductosDTO;
	private GestionDeProveedoresDAO gProveedoresDAO;
	private GestionDeProveedoresDTO gProveedoresDTO;

	public SistemaModulos() {
		modulo1dao = new Modulo1DAO();
		ab = new ArchivosBinarios();
		ventasdao = new GestionVentasDAO();
		ventasdto = new GestionVentasDTO(0, 0, 0, 0, 0);
		detallesdao=new DetallesVentaDAO();
		gClientesDAO = new GestionDeClientesDAO();
		gProductosDAO = new GestionDeProductosDAO();
		gProveedoresDAO = new GestionDeProveedoresDAO();

	}	

	public Modulo1DTO crearOModulo(String nt, String tc, String cdt,String ng, double it, double iv) {
		return modulo1dto = new Modulo1DTO(nt, tc, cdt, ng, it,iv);
	}

	public GestionVentasDTO crearOGestionVentas( double ced, double sin, double iva, double con) {
		ventasdto = new GestionVentasDTO(ventasdao.definirNoCompra(), ced, sin, iva, con);
		ventasdao.setNoCompra(1);
		return ventasdto;
	}
	
	public DetallesVentaDTO crearODetallesVentas(int codP, int can, double vu, double vt) {
		return detallesdto = new DetallesVentaDTO(codP, can, vu, vt, ventasdao.definirNoCompra()); 
	}
	
	public GestionDeClientesDTO crearOcliente(double ced,String nom,String dir, double tel, String corr) {
		return gClientesDTO = new GestionDeClientesDTO(ced,nom,dir,tel,corr);
	}

	public GestionDeProveedoresDTO crearOproveedor(int nit, String nom,String dir, double tel, String ciu) {
		return gProveedoresDTO = new GestionDeProveedoresDTO(nit,nom,dir,tel,ciu);
	}
	
	public GestionDeProductosDTO crearOproducto(int codp, String nomp, int nitp, double pc, double pv) {
		return gProductosDTO = new GestionDeProductosDTO(codp,nomp,nitp,pc,pv);
	}

	public GestionDeClientesDAO getgClientesDAO() {
		return gClientesDAO;
	}

	public void setgClientesDAO(GestionDeClientesDAO gClientesDAO) {
		this.gClientesDAO = gClientesDAO;
	}

	public GestionDeClientesDTO getgClientesDTO() {
		return gClientesDTO;
	}

	public void setgClientesDTO(GestionDeClientesDTO gClientesDTO) {
		this.gClientesDTO = gClientesDTO;
	}

	public GestionDeProductosDAO getgProductosDAO() {
		return gProductosDAO;
	}

	public void setgProductosDAO(GestionDeProductosDAO gProductosDAO) {
		this.gProductosDAO = gProductosDAO;
	}

	public GestionDeProductosDTO getgProductosDTO() {
		return gProductosDTO;
	}

	public void setgProductosDTO(GestionDeProductosDTO gProductosDTO) {
		this.gProductosDTO = gProductosDTO;
	}

	public GestionDeProveedoresDAO getgProveedoresDAO() {
		return gProveedoresDAO;
	}

	public void setgProveedoresDAO(GestionDeProveedoresDAO gProveedoresDAO) {
		this.gProveedoresDAO = gProveedoresDAO;
	}

	public GestionDeProveedoresDTO getgProveedoresDTO() {
		return gProveedoresDTO;
	}

	public void setgProveedoresDTO(GestionDeProveedoresDTO gProveedoresDTO) {
		this.gProveedoresDTO = gProveedoresDTO;
	}

	public DetallesVentaDTO getDetallesdto() {
		return detallesdto;
	}

	public void setDetallesdto(DetallesVentaDTO detallesdto) {
		this.detallesdto = detallesdto;
	}

	public DetallesVentaDAO getDetallesdao() {
		return detallesdao;
	}

	public void setDetallesdao(DetallesVentaDAO detallesdao) {
		this.detallesdao = detallesdao;
	}

	public GestionVentasDTO getVentasdto() {
		return ventasdto;
	}
	public void setVentasdto(GestionVentasDTO ventasdto) {
		this.ventasdto = ventasdto;
	}
	public GestionVentasDAO getVentasdao() {
		return ventasdao;
	}
	public void setVentasdao(GestionVentasDAO ventasdao) {
		this.ventasdao = ventasdao;
	}
	public Modulo1DTO getModulo1dto() {
		return modulo1dto;
	}
	public void setModulo1dto(Modulo1DTO modulo1dto) {
		this.modulo1dto = modulo1dto;
	}
	public Modulo1DAO getModulo1dao() {
		return modulo1dao;
	}
	public void setModulo1dao(Modulo1DAO modulo1dao) {
		this.modulo1dao = modulo1dao;
	}

	public ArchivosBinarios getAb() {
		return ab;
	}

	public void setAb(ArchivosBinarios ab) {
		this.ab = ab;
	}
	

}
