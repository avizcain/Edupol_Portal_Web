
package com.ethos.DAO;

import com.ethos.model.EstudianteModel;
import com.ethos.model.RegistroEstudianteModel;
import com.ethos.query.EstudiantesQuery;
import com.ethos.query.RegistroEstudianteQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mary
 */


public class EstudiantesDAO extends AbstractDAO<EstudianteModel>{
    
    EstudianteModel estudianteModel;
    
    public EstudiantesDAO(){
        super(EstudianteModel.class);
    }

    @Override
    public EstudianteModel select(Object id) {
         EstudianteModel estudianteModel = new EstudianteModel();
        try {
            conn=getConnectionDB().getConnection();
            psQuery=conn.prepareStatement(EstudiantesQuery.QUERY_GET_DATOS_COMPLEMENTARIOS_ESTUDIANTE);
            psQuery.setString(1, (String) id);
            rsT=psQuery.executeQuery();
            while(rsT.next()){
              estudianteModel.setiCodigoEst(Integer.parseInt(rsT.getString(1)));
            } 
        } catch (SQLException ex) {
            System.out.println("SQLException "+ex);
        }finally{
            closeConnection();
        }
       return estudianteModel;
    }

    @Override
    public String insert(EstudianteModel entityClass) {
       String query;
       String resultado="NOK";
       int rs=0;
        try {
            conn= getConnectionDB().getConnection();
            query=EstudiantesQuery.GUARDAR_DATOS_ESTUDIANTE;
            psQuery=conn.prepareStatement(query);
            psQuery.setInt(1, entityClass.getiCodigoEst());
            psQuery.setInt(2, entityClass.getiCategoriaSisben());
            psQuery.setInt(3,entityClass.getiNacionalidad() );
            psQuery.setInt(4,entityClass.getiPaisResidencia());
            psQuery.setInt(5,entityClass.getiDepartamentoResidencia());
            psQuery.setInt(6,entityClass.getiCiudadResidencia());
            psQuery.setString(7,entityClass.getsLocalidadResidencia());
            psQuery.setString(8,entityClass.getsBarrioResidencia());
            psQuery.setInt(9, entityClass.getiGrupoSaniguineo());
            psQuery.setInt(10,entityClass.getiLibretaMilitar());
            psQuery.setString(11,entityClass.getsFotografia());
          // if(entityClass.getiCodAcudiente()!=0){
                psQuery.setInt(12,entityClass.getiCodAcudiente());
           // }else{
           //    psQuery.setInt(12,Integer.parseInt(""));
           // }
            psQuery.setInt(13,entityClass.getiPaisEstudio());
            psQuery.setInt(14,entityClass.getiDepartamentoEstudio());
            psQuery.setInt(15,entityClass.getiCiudadEstudio());
            psQuery.setInt(16,entityClass.getiEstrato());
            psQuery.setInt(17,entityClass.getiTipoSolicitud());
            psQuery.setString(18,entityClass.getsCiudadNacimiento());
            psQuery.setString(19,entityClass.getsLugarNacimiento());
            rs=psQuery.executeUpdate();
             
        } catch (SQLException ex) {
            System.out.println("Sql Execptione"+ex);
        }finally{
            closeConnection();
        }
        if(rs > 0){
            resultado = "OK";
        }else{
            System.out.println("¡No se realizo la insercion en la tabla 'PERSONAS'!");
        }
        return resultado;
           
    }

    @Override
    public boolean update(EstudianteModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstudianteModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstudianteModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        String query;
        List<Object> Estudiantes= new ArrayList<>();
        List<Object> objectEstudiante;
        
        try {
            conn=getConnectionDB().getConnection();
            if(parameters!=null){
               query=EstudiantesQuery.QUERY_FILTRAR_ESTUDIANTES;
               psQuery=conn.prepareStatement(query);
               psQuery.setString(1,parameters.get(0).toString());
               rsT=psQuery.executeQuery();
            }else{
            
            query=EstudiantesQuery.QUERY_LISTAR_ESTUDIANTES_PREREGISTRO;
            psQuery=conn.prepareStatement(query);
            rsT=psQuery.executeQuery();
            }
            while (rsT.next()) {
                objectEstudiante=new ArrayList<>();
                objectEstudiante.add(rsT.getInt(1));
                objectEstudiante.add(rsT.getString(2));
                objectEstudiante.add(rsT.getString(3));
                objectEstudiante.add(rsT.getString(4));
                objectEstudiante.add(rsT.getString(5));
            Estudiantes.add(objectEstudiante);
            }
        } catch (SQLException ex) {
            System.out.println("SqlException: "+ex);
        }finally{
            closeConnection();
        }
        
    return Estudiantes;    
    }

    @Override
    public List<EstudianteModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
