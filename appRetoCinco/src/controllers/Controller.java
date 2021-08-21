package controllers;

import java.util.ArrayList;
import models.dao.AsesorPorCiudadDao;
import models.dao.CompraPorProveedorDao;
import models.dao.ProyectosCasaCampestreDao;
import models.vo.AsesorPorCiudad;
import models.vo.CompraPorProveedor;
import models.vo.ProyectosCasaCampestre;
import java.sql.SQLException;

public class Controller {
    
    private final CompraPorProveedorDao compraPorProveedorDao;
    private final ProyectosCasaCampestreDao proyectosCasaCampestreDao;
    private final AsesorPorCiudadDao asesorPorCiudadDao;

    public Controller(){
        this.compraPorProveedorDao = new CompraPorProveedorDao();
        this.asesorPorCiudadDao = new AsesorPorCiudadDao();
        this.proyectosCasaCampestreDao = new ProyectosCasaCampestreDao();
    }

    public ArrayList<AsesorPorCiudad> consultarAsesorPorCiudad() throws SQLException {
        return this.asesorPorCiudadDao.rankingAsesorPorCiudad();
    }
    
    public ArrayList<CompraPorProveedor> consultarCompraPorProveedor() throws SQLException {
        return this.compraPorProveedorDao.rankingCompraPorProveedor();
    }

    public ArrayList<ProyectosCasaCampestre> consultarProyectosCasaCampestre() throws SQLException {
        return this.proyectosCasaCampestreDao.rankingProyectosCasaCampestres();
    }
}
