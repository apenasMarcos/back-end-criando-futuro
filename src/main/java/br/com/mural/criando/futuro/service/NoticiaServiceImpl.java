package br.com.mural.criando.futuro.service;

import br.com.mural.criando.futuro.model.Noticia;
import br.com.mural.criando.futuro.repository.NoticiaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoticiaServiceImpl implements NoticiaService {

    private final NoticiaRepository noticiaRepository;

    public NoticiaServiceImpl(NoticiaRepository noticiaRepository) {
        this.noticiaRepository = noticiaRepository;
    }

    public List<Noticia> getAllNoticias() {
        return noticiaRepository.findAll();
    }

    public Optional<Noticia> getNoticiaById(Long id) {
        return noticiaRepository.findById(id);
    }

    public void saveNoticia(Noticia noticia) {
        noticiaRepository.save(noticia);
    }
}
