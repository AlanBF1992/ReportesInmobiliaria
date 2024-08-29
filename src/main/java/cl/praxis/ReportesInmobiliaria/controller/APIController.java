package cl.praxis.ReportesInmobiliaria.controller;

import cl.praxis.ReportesInmobiliaria.model.dto.Reporte;
import cl.praxis.ReportesInmobiliaria.model.service.ReporteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    private final ReporteService reporteService;
    private HttpStatus status = HttpStatus.OK;

    public APIController(ReporteService reporteService) {
        this.reporteService = reporteService;
    }

    @GetMapping
    public List<Reporte> getReportes() {
        return reporteService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Reporte getReporteById(@PathVariable int id) {
        return reporteService.findById(id);
    }

    @PostMapping
    public Reporte addReporte(@RequestBody Reporte reporte) {
        if (reporteService.save(reporte)) {
            return reporte;
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteReporteById(@PathVariable int id) {
        reporteService.delete(id);
    }

    @PutMapping
    public Reporte updateReporte(@RequestBody Reporte reporte) {
        if (reporteService.update(reporte)) {
            return reporte;
        }
        return null;
    }
}
