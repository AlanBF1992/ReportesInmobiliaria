package cl.praxis.ReportesInmobiliaria.model.repository;

import cl.praxis.ReportesInmobiliaria.model.dto.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReporteRepository extends JpaRepository<Reporte, Integer> {
    @NonNull
    List<Reporte> findAll();
    Reporte findById(int id);
}
