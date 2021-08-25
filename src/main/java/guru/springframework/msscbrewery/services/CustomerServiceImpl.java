package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder().id(UUID.randomUUID())
                .customerName("John Johnson Johansen")
                .build();
    }
}
