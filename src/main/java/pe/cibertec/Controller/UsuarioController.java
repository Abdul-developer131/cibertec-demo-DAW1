package pe.cibertec.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.cibertec.entity.Usuario;
import pe.cibertec.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

    //Constructor para inicializar repository
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //Funcion para registrar un nuevo usario
    @PostMapping("/registrar")
    //ResponseEntity es la respuesta que guarda el registro
    public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario){
        Usuario usuarioRegistrado = usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuarioRegistrado);
    }

    // Funcion para mopstrar todos los usuarios registrados
    @GetMapping
    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }
}
