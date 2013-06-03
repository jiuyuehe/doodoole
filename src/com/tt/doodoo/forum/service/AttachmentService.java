package com.tt.doodoo.forum.service;

import com.tt.doodoo.forum.model.Attachment;



public interface AttachmentService {
	
	/**
	 * 添加一个附件
	 * @param att
	 * @return
	 */
	Attachment addAttachment(Attachment att);

}
