import { Component, OnInit } from '@angular/core';
import { Workbook } from 'exceljs';
import * as fs from 'file-saver';

@Component({
  selector: 'app-download',
  templateUrl: './download.component.html',
  styleUrls: ['./download.component.css']
})
export class DownloadComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  generateExcel() {
    const workbook = new Workbook();
    const worksheet = workbook.addWorksheet('Some Data');

    const logo = workbook.addImage({
      base64: '',
      extension: 'png',
    });

    worksheet.addImage(logo, 'E1:F3');
  }

}
