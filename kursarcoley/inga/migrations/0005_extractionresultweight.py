# -*- coding: utf-8 -*-
# Generated by Django 1.9.7 on 2016-07-11 09:54
from __future__ import unicode_literals

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('inga', '0004_auto_20160707_1608'),
    ]

    operations = [
        migrations.CreateModel(
            name='ExtractionResultWeight',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('trait', models.CharField(max_length=100)),
                ('measurement', models.FloatField(blank=True, default=0, null=True)),
                ('extraction', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='inga.Extraction')),
            ],
        ),
    ]