package guru.springframework.sfgpetclinic;


import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.controllers.OnwerController;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(OnwerController.class)
public class OnwerControllerTests {

    @Mock
    OwnerService ownerService;

    OnwerController controller;


    MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        controller = new OnwerController(ownerService);
        mockMvc = MockMvcBuilders.
                standaloneSetup(controller).
                build();
    }

    @Test
    public void showOwner() throws Exception {

        when(ownerService.findByID(anyLong())).thenReturn(new Owner());

        mockMvc.perform(get("/owners/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/ownerDetails"))
                .andExpect(model().attributeExists("owner"));


    }
}
