package com.gabri.developer.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabri.developer.hrpayroll.entities.Payment;
import com.gabri.developer.hrpayroll.entities.Worker;
import com.gabri.developer.hrpayroll.feignclients.WorkerFeignClient;

@Service // Usado para marcar a classe como um provedor de serviços 
public class PaymentService {

	@Autowired  //Indica onde a injeção automática deve ser aplicada
	private WorkerFeignClient workerFeignClient;

	public Payment getPayment(long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}