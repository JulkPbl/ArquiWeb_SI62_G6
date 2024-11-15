package pe.edu.upc.project_security_g06.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project_security_g06.entities.Historial_Ubicacion;
import pe.edu.upc.project_security_g06.repositories.IHistorial_UbicacionRepository;
import pe.edu.upc.project_security_g06.servicesinterfaces.IHistorial_UbicacionService;

import java.util.List;

@Service
public class Historial_UbicacionServiceImplement implements IHistorial_UbicacionService {
    @Autowired
    private IHistorial_UbicacionRepository huR;

    @Override
    public void insert(Historial_Ubicacion h) {
        huR.save(h);
    }

    @Override
    public List<Historial_Ubicacion> listar() {
        return huR.findAll();
    }

    @Override
    public Historial_Ubicacion listid(int idHistorial) {
        return huR.findById(idHistorial).orElse(new Historial_Ubicacion());
    }

    @Override
    public void update(Historial_Ubicacion h) {
        huR.save(h);
    }

    @Override
    public void delete(int IdHistorial_Ubicacion) {
        huR.deleteById(IdHistorial_Ubicacion);
    }
}
